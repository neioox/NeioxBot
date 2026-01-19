package utils;


import net.dv8tion.jda.api.EmbedBuilder;

public class ErrorMessage {
    String message;

 public EmbedBuilder errorembed = new EmbedBuilder();


    public void setMessage(String newmessage){

        this.message = newmessage;
    }
    public void ErrorMessage(){

        this.errorembed.setTitle("Oh oh! es ist ein Fehler aufgetreten ❌");
        this.errorembed.setDescription(this.message);


    }


}
