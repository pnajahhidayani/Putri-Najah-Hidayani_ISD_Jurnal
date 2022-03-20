public class Lagu {
    private String judulLagu;
    private String penyanyi;

    public Lagu (String judulLagu, String penyanyi) {
        this.judulLagu = judulLagu;
        this.penyanyi = penyanyi;
    }
    public String getJudulLagu() {
        return judulLagu;
    }
    public String toString(){
        return judulLagu + "(" + penyanyi + ")" + "-";
    }
}
