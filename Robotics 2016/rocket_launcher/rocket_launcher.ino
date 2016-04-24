
#include <SoftwareSerial.h>
//RELAY DOC http://www.seeedstudio.com/wiki/Relay_Shield_V2.0
// LCD DOC https://www.parallax.com/sites/default/files/downloads/27979-Parallax-Serial-LCDs-Product-Guide-v3.1.pdf
//PIN NUMBERS
const int LCDPin=3;
const int relayPin=4;
const int buttonPin=2;
SoftwareSerial mySerial = SoftwareSerial(255, LCDPin);
int time = 10;
String timeprint="T-";

void setup(){
  pinMode(LCDPin, OUTPUT);
  digitalWrite(LCDPin, HIGH);
  pinMode(relayPin, OUTPUT);
 
  mySerial.begin(9600);  //setup for lcd 
  mySerial.write(22);
  delay(100);
  mySerial.write(12);
  delay(5);  
  mySerial.write(17);
  mySerial.write(210);  
  mySerial.print(timeprint+time);
}

void loop(){
  for(time; time>=0 && digitalRead(buttonPin)==LOW; time--){ //prints 9 through 0 with beep while button held
    mySerial.write(12);
    delay(5);
    mySerial.print(timeprint+time);
    mySerial.write(220);
    
    if(time==1){ //at t=1, 4 warning beeps
      mySerial.write(220); 
      mySerial.write(220);  
      mySerial.write(220); 
      mySerial.write(220); 
    }
    delay(1000);
    if(time==0 && digitalRead(buttonPin)==LOW){  //at t=0 relay on              
      mySerial.write(12);
      delay(5);
      mySerial.print("IGNITION");
      if(digitalRead(buttonPin)==LOW)
        digitalWrite(relayPin, HIGH);
      time--;
      countUp();
    }
  }
  
  if(time!=10 && time!=60){ //reset if button not held
    time=10;
    mySerial.write(220);  
    mySerial.write(220); 
    mySerial.write(12);
    delay(5);
    timeprint="T-";
    mySerial.print(timeprint+time);
  }
}
void countUp(){   //counts up from launch to 60s
  timeprint="T+";
  delay(3000);
  for(int t=3; t<=60; t++){
    if(t==10) //relay off at t=10
      digitalWrite(relayPin, LOW);
    if(digitalRead(buttonPin)==LOW && t>=10) //if button pressed after 10s, reset
      break;
    mySerial.write(12);
    delay(5);
    mySerial.print(timeprint+t);
    delay(1000);
  }
}
