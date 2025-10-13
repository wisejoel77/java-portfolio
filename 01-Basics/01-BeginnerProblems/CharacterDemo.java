class Execution {
    char a = '#';
    char b = 35;
    char c = '\u0023';

    void display(){
        System.out.println("Character Literal: " + a);
        System.out.print("Integer Literal: " + b + "\n");
        System.out.printf("Unicode: %c",c);
    }

}
public class CharacterDemo{
    public static void main(String[] args){
        Execution obj = new Execution();
        obj.display();
    }
}
