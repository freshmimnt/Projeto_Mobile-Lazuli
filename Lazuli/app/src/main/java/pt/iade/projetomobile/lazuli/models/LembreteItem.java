package pt.iade.projetomobile.lazuli.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class LembreteItem implements Serializable {

    private int id;
    private boolean done;
    private String title;

    private Calendar date;

    private Date time;

    private String description;

    private Agenda agenda;

    public LembreteItem(){

    }

    public LembreteItem(int id, boolean done, String title, Calendar date,
                        Date time, String description) {
        this.id = id;
        this.done = done;
        this.title = title;
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public static ArrayList<LembreteItem> List(){

        ArrayList<LembreteItem> items = new ArrayList<>();
        items.add(new LembreteItem(3, false,"Arroz", new GregorianCalendar(), new Date(), "Algo"));

        return items;
    }

    public static LembreteItem GetById(int id){
        return new LembreteItem(id, false, "Alloy", new GregorianCalendar(), new Date(), "Shine");

    }

    public void save(){
        if(id == 0){
            id = new Random().nextInt(1000) + 1;
        }else{

        }
    }

    public int getId() {
        return id;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

}
