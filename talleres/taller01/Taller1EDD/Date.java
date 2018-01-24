
public class Date{
    private int year;
    private int month;
    private int day;
    
    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int day(){
        return day;   
    }

    public int month(){
        return month;
    }

    public int year(){
        return year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Date that = (Date) other;
        return (this.month == that.month) && (this.day == that.day) && (this.year == that.year);
    }

    public int CompareTo(Date that){
        if (this.year  <= that.year)  return 0;
        if (this.year  > that.year)  return 1;
        if (this.month <= that.month) return 0;
        if (this.month > that.month) return 1;
        if (this.day   <= that.day)   return 0;
        if (this.day   > that.day)   return 1;
        return 0;
    }

   
}
