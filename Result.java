class Result{
    public static void main(String[] args){
        int marathi = 60, maths = 80, english = 30, science = 40, eg = 56, cg = 60;
        // System.out.println(maths);
            int passlim = 32;
            int total = marathi + maths + english + science + eg + cg;
            Float percentage =(float)(total*100)/600;
            System.out.println("Total marks obtained : "+total);
            System.out.println("Total percentage obtained : "+percentage);

            if(marathi>=passlim && maths>=passlim && english>=passlim && science>=passlim && eg>=passlim && cg>=passlim){
                System.out.println("Congratulations!!!.. Youare passed");
            }
            else{
                System.out.println("You are failed");
            }

            int counter=0;
            System.out.println("Failed Subject : ");
            if(maths<passlim){
                System.out.println("Maths");
                counter++;
            }
            if(marathi<passlim){
                System.out.println("Marathi");
                counter++;
            }
            if(english<passlim){
                System.out.println("english");
                counter++;
            }
            if(science<passlim){
                System.out.println("science");
                counter++;
            }
            if(eg<passlim){
                System.out.println("eg");
                counter++;
            }
            if(cg<passlim){
                System.out.println("cg");
                counter++;
            }

            System.out.println("number of subject failed are : "+counter);

            if(counter>5){
                System.out.println("DROP");
            }
            else{
                if(counter!=0){
                    System.out.println("KT");
                }
            }

    }
}