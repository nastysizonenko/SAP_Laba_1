package com.company;

public class Student {

    private int id;
    private String surName;//Фамилия
    private String name;//Имя
    private String otchesto;//Отчество
    private String adress;//Адрес
    private String phone;//Телефон
    private int[] rating;//Оценки

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchesto() {
        return otchesto;
    }

    public void setOtchesto(String otchesto) {
        this.otchesto = otchesto;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int [] getRating() {
        return rating;
    }

    public void setRating(int rating []) {
        this.rating = rating;
    }

    private String printArry(int [] rating){
        String str="";
        for(int i: rating){
            str+=i+" ";
        }
        return str;
    }

    public void printInfo(){
        System.out.println(id+" "+surName+" "+name+" "+otchesto+" "+adress+" "+phone+" "+printArry(rating));
    }

    public int avg(int [] rating){
        int result=0;
        for(int i: rating){
            result+=i;
        }
        return result/rating.length;
    }

    public Student(int id, String surName, String name, String otchesto,
                   String adress, String phone, int [] rating) {
        super();
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.otchesto = otchesto;
        this.adress = adress;
        this.phone = phone;
        this.rating = rating;
    }

}
