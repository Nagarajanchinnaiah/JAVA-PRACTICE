//SIMPLE EXAMPLE 

// class stringprogram {
//     public static void main(String[] args) {
//         String Name = "Nagarajan";
//         System.out.println(Name);
//     }
// }

//----------------------------------------------------------------------------------------------------
//INDEX

// class stringprogram{
//     public static void main(String[]args){
//          String check="Java Programming is Good, Java is PowerFull, I Love Java";
//         System.out.println(check.indexOf("Java"));
//         System.out.println(check.lastIndexOf("Java"));
//     }

// }
//------------------------------------------------------------------------------------------------------

// class stringprogram{
//     public static void main(String[]args){
//         String answer="10";
//         System.out.println(answer.toString());

//     }
// }
//------------------------------------------------------------------------------------------------------
// class stringprogram{
//     public static void main(String[]args){
//        String check="Call Cat Cut";
//         String regex="Call";
//         System.out.println(check.replaceFirst(regex, "Ball"));
//         System.out.println(check.replace("C", "B")); 
//     }
// }

//-------------------------------------------------------------------------------------------------

// class stringprogram{
//     public static void main(String[]args){
//         String check = "Naga Rajan ";
//         String check1="";
//         System.out.println(check.isEmpty());
//         System.out.println(check1.isEmpty());
//         System.out.println(check.startsWith("N"));
//         System.out.println(check.endsWith("n"));
//         System.out.println(check.contains("Rajan"));

//     }
// }
//-------------------------------------------------------------------------------------------------

// class stringprogram{
//     public static void main(String[]args){
     
//         String FName="Nagarajan";
//         String LName="C";
//         System.out.println(FName+LName);
//         System.out.println(FName.concat(LName));

//     }
// }

//---------------------------------------------------------------------------------------------------
// class stringprogram{
//     public static void main(String[]args){
//         String txt1 = "nagarjan";
//         String txt2 = "cricketer";
//         System.out.println(txt1.compareTo(txt2));
//         System.out.println(txt1.compareToIgnoreCase(txt2));
//     }
// }

//---------------------------------------------------------------------------------------------
// class stringprogram{
//     public static void main(String[]args){
//         String txt = "      Nagarajan      ";
//         System.out.println(txt);
//         System.out.println(txt.trim());

//     }
// }

//----------------------------------------------------------------------------------------------------
//PASSWORD
// class stringprogram{
//     public static void main(String[]args){
//         String PWD1 = "Naga";
//         String PWD2 = "rajan";
//         String PWD3 = "Cricketer";
//         System.out.println(PWD1.equals(PWD2));
//         System.out.println(PWD2.equals(PWD3));

//     }
// }
//-----------------------------------------------------------------------------------------------
class stringprogram{
    public static void main(String[]args){
        String Name = "Nagarajan";
        System.out.println(Name.indexOf("j"));
        System.out.println(Name.charAt(4));
        System.out.println(Name);
        System.out.println(Name.length());
        System.out.println(Name.toUpperCase());
        System.out.println(Name.toLowerCase());

    }
}
        