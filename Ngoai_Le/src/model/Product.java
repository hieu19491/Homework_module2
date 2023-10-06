package model;

public class Product {
        private int id;
        private String nameProduct;
        private int quantity;
        private int price;
        private String unit;
        private static int incrementId = 1;

        public Product() {
        }

        public Product(String nameProduct, int quantity, int price, String unit) {
            this.id = incrementId;
            this.nameProduct = nameProduct;
            this.quantity = quantity;
            this.price = price;
            this.unit = unit;
            incrementId++;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNameProduct() {
            return nameProduct;
        }

        public void setNameProduct(String nameProduct) {
            this.nameProduct = nameProduct;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", nameProduct='" + nameProduct + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    ", unit='" + unit + '\'' +
                    '}';
        }
    }


