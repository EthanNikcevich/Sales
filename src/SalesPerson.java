/**
 * Created by h205p2 on 9/27/17.
 */
class SalesPerson /* each object contains details of one salesperson*/ {
        private String id;
        private Sales[] salesHistory=new Sales[100];
        /* details of the different sales*/
        private int count = 0;
        /* number of sales made*/


        public SalesPerson(String id) {
                this.id = id;
        }

        // constructor for a salesperson transferred (together with
// their sales details) from another branch
        public SalesPerson(String id, Sales[] sales, int c) {
                this.id = id;
                this.salesHistory = sales;
                this.count = c;
        }

        public int getCount() {
                return count;
        }

        public String getId() {
                return id;
        }

        public void setSalesHistory(Sales s) {
                salesHistory[count] = s;
                count = count + 1;
        }

        public double calcTotalSales() {
// calculates total sales for the
// salesperson
                double totalSales = 0;
                for(int i=0; i<count; i++){
                        totalSales +=salesHistory[i].getQuantity() *salesHistory[i].getValue();
                }
                return totalSales;
        }
}


