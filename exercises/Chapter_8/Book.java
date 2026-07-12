package exercises.Chapter_8;

public enum Book {
    JHTP("Java How to Program","2018"),
    CHTP("C How to Program","2016"),
    IW3HTP("Internet World Wide Web How to Program","2012"),
    CPPHTP("C++ How to Program","2014");
    private final String title;
    private final String copyRightYear;
    Book(String title,String copyRightYear){
        this.title=title;
        this.copyRightYear=copyRightYear;
    }
    public String getTitle(){
        return title;
    }
    public String getCopyRightYear() {
        return copyRightYear;
    }
}
