package Secao14HerancaPolimorfismo.entities;

public class Product14 {
        private String name;
        private Double price;

        public Product14(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String priceTag() {
            return name
                    + " $ "
                    + String.format("%.2f", price);
        }
}