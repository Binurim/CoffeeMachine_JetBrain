class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if(minutes>=59 && hours<12){
            hours+=1;
            minutes=0;
        }else if(minutes>=59 && hours>=12){
            minutes=0;
            hours=1;
        }else{
            minutes+=1;
        }
    }
}