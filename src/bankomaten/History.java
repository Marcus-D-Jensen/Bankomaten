

package bankomaten;

import java.sql.Date;


public class History {
    protected int id;
    protected Date date;
    protected double sum;

    public History(int id, Date date, double sum) {
        this.id = id;
        this.date = date;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
