class book

{
    String name;
    String publish;
    Author author;
    book()
    {
        System.out.println("thanks for reading the book");
    }
    book(String name,String publish,Author author)
    {
        System.out.println("\nBOOK DETAILS");
        System.out.println("name: "+name+"\npublish: "+publish);
        author.print();
    }

}
class Author
{
    String name;
    int age;
    String city;
    Author(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    void print()
    {
        System.out.println("\nPUBLISHER DETAILS");
        System.out.println("Name: "+name+"\nAge:"+age+"\nCity:"+city);
    }
    
}

public class SampleFile {
    public static void main(String[] args) {
        Author a= new Author("JP Morgan",54,"Queens");
        book b = new book("HOW TO BECOME RICH","BPO",a);
        
    }
}
