
const int buzzerPin = 12;
const int redPin= 11;
const int greenPin=10;
const int bluePin=9;
const int buttPin=2;

char notes[]="eeecgecgebbbCgecge"; 
int beats[]={2,2,2,1,1,2,1,1,4,2,2,2,1,1,2,1,1,4};
int tempo = 315;
int songLength = sizeof(notes)-1;

void setup(){
  pinMode(buzzerPin, OUTPUT);
  pinMode(redPin, OUTPUT);
  pinMode(greenPin, OUTPUT);
  pinMode(bluePin, OUTPUT);
  pinMode(buttPin, INPUT);
}

void loop(){
  if(!digitalRead(buttPin)){
    for (int i = 0; i < songLength; i++){
      tone(buzzerPin, frequency(notes[i]), beats[i] * tempo);
      showColor();
      delay(beats[i] * tempo);          
    }
    digitalWrite(redPin, LOW);
    digitalWrite(greenPin, LOW);
    digitalWrite(bluePin, LOW);
  }
}

int frequency(char note) {
  char names[] = { 'c', 'd', 'e', 'f', 'g', 'a', 'b', 'C' };
  int frequencies[] = {262, 294, 330, 349, 392, 440, 494, 523};
  
  for (int i = 0; i < sizeof(names); i++)
    if (names[i] == note)
      return(frequencies[i]);   
  return(0);  
}

void showColor(){
  int ledcolor=random(7);
  switch (ledcolor) {
    case 0: //green
      digitalWrite(redPin, LOW);
      digitalWrite(greenPin, HIGH);
      digitalWrite(bluePin, LOW);
      break;
    case 1: //red
      digitalWrite(redPin, HIGH);
      digitalWrite(greenPin, LOW);
      digitalWrite(bluePin, LOW);
      break;
    case 2: //blue
      digitalWrite(redPin, LOW);
      digitalWrite(greenPin, LOW);
      digitalWrite(bluePin, HIGH);
      break;
    case 3: //cyan
      digitalWrite(redPin, LOW);
      digitalWrite(greenPin, HIGH);
      digitalWrite(bluePin, HIGH);
      break;
    case 4: //purple
      digitalWrite(redPin, HIGH);
      digitalWrite(greenPin, LOW);
      digitalWrite(bluePin, HIGH);
      break;
    case 5: //yellow
      digitalWrite(redPin, HIGH);
      digitalWrite(greenPin, HIGH);
      digitalWrite(bluePin, LOW);
      break;
    case 6: //white
      digitalWrite(redPin, HIGH);
      digitalWrite(greenPin, HIGH);
      digitalWrite(bluePin, HIGH);
      break;
  }
}
