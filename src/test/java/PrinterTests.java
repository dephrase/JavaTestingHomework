import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {

    Printer printer;
    @Before
    public void setUp(){
        printer = new Printer(10, 10);
    }

    @Test
    public void testNumberOfSheetsRemainingIs10(){
        assertEquals(10, printer.getSheetsRemaining());
    }

    @Test
    public void testPrint3PagesRemoves3Pages(){
        printer.printPages(3);
        assertEquals(7, printer.getSheetsRemaining());
    }

    @Test
    public void testPrintWillNotPrintIfTooManyPagesRequested(){
        printer.printPages(12);
        assertEquals(10, printer.getSheetsRemaining());
    }

    @Test
    public void testPrinterHasToner(){
        assertEquals(10, printer.getRemainingToner());
    }

    @Test
    public void testTonerIsReducedForEachPage(){
        printer.printPages(1);
        assertEquals(9, printer.getRemainingToner());
    }
}
