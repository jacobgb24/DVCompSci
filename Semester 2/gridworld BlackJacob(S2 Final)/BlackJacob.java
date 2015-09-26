import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.awt.Color;

public class BlackJacob extends Critter
{
    private int killCount=0;
    private Location nextMove;
    private boolean danceTime=false, diagmov;

    public BlackJacob(){
        setColor(Color.BLACK);
        if(Math.round(Math.random())==1)
            diagmov=true;
        else
            diagmov=false;
    }
    public BlackJacob(boolean movement){
        setColor(Color.BLACK);
        if(movement)
            diagmov=true;
        else
            diagmov=false;
    }

    public ArrayList<Actor> getActors(){
        ArrayList<Actor> otherActors = new ArrayList<Actor>();
        ArrayList<Actor> allActors = new ArrayList<Actor>();
        ArrayList<Location> area = getGrid().getOccupiedLocations();
        for(int i = 0; i<area.size(); i++){ 
            if(area.get(i)!=null && !(getGrid().get(area.get(i)).getClass().getName().toLowerCase().contains("black")) )
                otherActors.add(getGrid().get(area.get(i)));
            if(area.get(i)!=null && !(getGrid().get(area.get(i)).getClass().getName().toLowerCase().contains("blackjacob")))
                allActors.add(getGrid().get(area.get(i)));
        }
        Comparator<Actor> compareDist = new Comparator<Actor>(){
            @Override
            public int compare(final Actor a1, final Actor a2){
                return distance(a1.getLocation())-distance(a2.getLocation());
            }
        };
        Collections.sort(allActors, compareDist);
        Collections.sort(otherActors, compareDist);
        if(allActors.size()==0)
            danceTime=true;
        if(otherActors.size()==0)
            return allActors;
        return otherActors;
    }

    public void processActors(ArrayList<Actor> actors)
    {
        if (actors.size()==0)
            return;
        for(int i=0; i<actors.size(); i++){
            if(distance(actors.get(i).getLocation())<=5 && (actors.get(i) instanceof Critter)){
                actors.get(i).removeSelfFromGrid();       
                actors.remove(i);
                killCount++;
                break;
            }
            if(i==actors.size()-1 && distance(actors.get(0).getLocation())<=5){
                actors.get(0).removeSelfFromGrid();
                actors.remove(0);
                break;
             }
        }
        
        if(killCount>0){
            BlackJacob newby = new BlackJacob(false);
            Location placement = new Location(getLocation().getRow()+1, getLocation().getCol()+1);
            if(getGrid().isValid(placement) && getGrid().get(placement)==null){
                newby.putSelfInGrid(getGrid(), placement);
                killCount--;
            }
        }
        for(int i =0; i<actors.size(); i++)
            if(actors.get(i) instanceof Critter){
                nextMove=actors.get(i).getLocation(/*Brett was here*/);
                break;
            }
    }

    public Location selectMoveLocation(ArrayList<Location> locs)
    {
        Location temp = new Location(0,0);
        Location newLoc;
       if(danceTime && locs.size()>0){
            temp= new Location(getGrid().getNumRows()/2, getGrid().getNumCols()/2);
            newLoc=locs.get(0);
           for(int i=0; i<locs.size(); i++){
                if(distance(temp, locs.get(i))<distance(temp, newLoc))
                    newLoc=locs.get(i);
           }
           return newLoc;
       }
       if(diagmov){
           if(distance(temp)>=2){
                newLoc= new Location(getLocation().getRow()-2, getLocation().getCol()-2);
                if(getGrid().isValid(newLoc) && getGrid().get(newLoc)==null)
                    return newLoc;
                newLoc= new Location(getLocation().getRow(), getLocation().getCol()-2);
                if(getGrid().isValid(newLoc) && getGrid().get(newLoc)==null)
                    return newLoc;
                newLoc= new Location(getLocation().getRow()-2, getLocation().getCol());
                if(getGrid().isValid(newLoc) && getGrid().get(newLoc)==null)
                    return newLoc;
           }
           if(distance(temp)>=1){
                newLoc= new Location(getLocation().getRow()-1, getLocation().getCol()-1);
                if(getGrid().isValid(newLoc) && getGrid().get(newLoc)==null)
                    return newLoc;
                newLoc= new Location(getLocation().getRow()-1, getLocation().getCol());
                if(getGrid().isValid(newLoc) && getGrid().get(newLoc)==null)
                    return newLoc;
                newLoc= new Location(getLocation().getRow(), getLocation().getCol()-1);
                if(getGrid().isValid(newLoc) && getGrid().get(newLoc)==null)
                    return newLoc;
           }
       }
       else if(locs.size()>0){
           newLoc=locs.get(0);
           if(nextMove==null)
                return locs.get((int)(Math.random()*locs.size()));
           for(int i=0; i<locs.size(); i++){
                if(distance(nextMove, locs.get(i))<distance(nextMove, newLoc))
                    newLoc=locs.get(i);
           }
           return newLoc;
       }
       return getLocation(); 
    }

    public void makeMove(Location loc)
    {   
        if(danceTime)
            setDirection(getDirection()+89);
        setDirection(getDirection()+1);
        super.makeMove(loc);
    }

    public int distance(Location l){
        int dr= Math.abs(l.getRow()-getLocation().getRow());
        int dc= Math.abs(l.getCol()-getLocation().getCol());
        if(dc>dr)
            return dc;
        else
            return dr;
    }
    public int distance(Location l1, Location l2){
        int dr= Math.abs(l1.getRow()-l2.getRow());
        int dc= Math.abs(l1.getCol()-l2.getCol());
        if(dc>dr)
            return dc;
        else
            return dr;
    }
}
