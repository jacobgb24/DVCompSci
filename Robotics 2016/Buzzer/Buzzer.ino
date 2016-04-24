const int buzPin = 5;
const int ledB = 2;
const int ledG = 3;
const int ledR = 4;
const int buttR = 9;
const int buttW = 10;
const int buttG = 11;
const int buttB = 12;

void setup(){
    pinMode(buzPin, OUTPUT);
    pinMode(ledB, OUTPUT);
    pinMode(ledG, OUTPUT);
    pinMode(ledR, OUTPUT);
    pinMode(buttR, INPUT);
    pinMode(buttW, INPUT);
    pinMode(buttG, INPUT);
    pinMode(buttB, INPUT);
}

void loop(){
  for(int i = random(10)+20; i>0; i--){
    delay(100);
  }
  tone(buzPin, 786, 250);
  while(true){
    if(!digitalRead(buttG)){
      digitalWrite(ledG, HIGH);
      break;
    }
    if(!digitalRead(buttB)){
      digitalWrite(ledB, HIGH);
      break;
    }
    if(!digitalRead(buttR)){
      digitalWrite(ledR, HIGH);
      break;
    }
    if(!digitalRead(buttW)){
      digitalWrite(ledG, HIGH);
      digitalWrite(ledR, HIGH);
      digitalWrite(ledB, HI);
      break;
    }
  }    
      
    delay(2000);
    tone(buzPin, 786, 100);
    delay(250);
    tone(buzPin, 256, 100);
    digitalWrite(ledG, LOW);
    digitalWrite(ledR, LOW);
    digitalWrite(ledB, LOW);
}
  

