import commands.Calculator;
import net.dv8tion.jda.api.events.interaction.ButtonClickEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.naming.InterruptedNamingException;

public class ClickButtonEvent extends ListenerAdapter {

    int num = 1;
    int num1 ;
    int num2;


    int result;
    int operation;
    int disnum ;

    @Override
    public void onButtonClick(@NotNull ButtonClickEvent event) {





        if(num  == 1){
            disnum = num1;
        } else if (num == 2) {
            disnum = num2;
        }


        event.deferEdit().queue();
        switch (event.getButton().getId()){



            case "1":
                if(num  == 1){
                 num1 = 1;
                } else if (num == 2) {
                    num2 = 1;
                }
                num ++;
                if(num == 3){
                    num = 1;
                }
                Calculator.title = String.valueOf(disnum);

                break;
            case "2":


                if(num  == 1){
                    num1 = 2;
                } else if (num == 2) {
                    num2 = 2;
                }
                num ++;
                if(num == 3){
                    num = 1;
                }

                break;
            case "3":

                if(num  == 1){
                    num1 = 3;
                } else if (num == 2) {
                    num2 = 3;
                }
                num ++;
                if(num == 3){
                    num = 1;
                }
                break;
            case "4":
                if(num  == 1){
                    num1 = 4;
                } else if (num == 2) {
                    num2 = 4;
                }

                num ++;
                if(num == 3){
                    num = 1;
                }
                break;
            case "5":
                if(num  == 1){
                    num1 = 5;
                } else if (num == 2) {
                    num2 = 5;
                }

                num ++;
                if(num == 3){
                    num = 1;
                }
                break;
            case "6":
                    if(num  == 1){
                    num1 = 6;
                } else if (num == 2) {
                    num2 = 6;
                }

                num ++;
                if(num == 3){
                    num = 1;
                }
                break;
            case "7":

                if(num  == 1){
                    num1 = 7;
                } else if (num == 2) {
                    num2 = 7;
                }
                num ++;
                if(num == 3){
                    num = 1;
                }

                break;
            case "8":
                if(num  == 1){
                    num1 = 8;
                } else if (num == 2) {
                    num2 = 8;
                }
                num ++;
                if(num == 3){
                    num = 1;
                }

                break;
            case "9":
                if(num  == 1){
                    num1 = 9;
                } else if (num == 2) {
                    num2 = 9;
                }

                num ++;
                if(num == 3){
                    num = 1;
                }

                break;





            case  "+":
                System.out.println(num1 + num2);
                operation= 1;



             break;

            case  "-":
                System.out.println(num1 - num2);
               operation=2;
                break;


            case  "*":

                operation= 3;

                break;

            case "=":
                if(operation == 1){
                   result = num1 +num2;
                    event.getChannel().sendMessage(Integer.toString(num1)+ "+"+ Integer.toString(num2)+  "=" +  result).queue();
                } else if (operation == 2) {
                    result = num1-num2;
                    event.getChannel().sendMessage(Integer.toString(num1)+ "-"+ Integer.toString(num2)+  "=" +  result).queue();
                } else if (operation ==3) {
                    event.getChannel().sendMessage(Integer.toString(num1)+ "*"+ Integer.toString(num2)+  "=" +  result).queue();
                    result = num1 * num2;
                }

                break;

      }


    }
}
