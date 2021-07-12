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

    public void printPages(int pages, int copies) {
        if((pages * copies) <= this.sheetsRemaining){
            this.sheetsRemaining -= (pages * copies);
            this.toner -= (pages * copies);
        }
    }

    public int getRemainingToner() {
        return this.toner;
    }
}
