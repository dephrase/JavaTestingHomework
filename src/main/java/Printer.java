public class Printer {

    private int sheetsRemaining;
    private int toner;

    public Printer(int sheetsRemaining, int toner){
        this.sheetsRemaining = sheetsRemaining;
        this.toner = toner;
    }

    public int getSheetsRemaining() {
        return this.sheetsRemaining;
    }

    public void printPages(int pages) {
        if(pages <= this.sheetsRemaining){
            this.sheetsRemaining -= pages;
            this.toner -= pages;
        }
    }

    public int getRemainingToner() {
        return this.toner;
    }
}
