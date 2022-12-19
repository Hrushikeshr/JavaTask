package javaassignment;

public class StudyMaterials {
    private String bookName;
    private String bookName2;
    private String pdfs;
    public StudyMaterials(String bookName, String bookName2, String pdfs) {
        super();
        this.bookName = bookName;
        this.bookName2 = bookName2;
        this.pdfs = pdfs;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookName2() {
        return bookName2;
    }
    public void setBookName2(String bookName2) {
        this.bookName2 = bookName2;
    }
    public String getPdfs() {
        return pdfs;
    }
    public void setPdfs(String pdfs) {
        this.pdfs = pdfs;
    }
}
