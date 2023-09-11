public class Rectangle {

    public int length;
    public int width;

    public Rectangle(int lengthInput, int widthInput) {
        this.length = lengthInput;
        this.width = widthInput;
    }

    @Override
    public String toString() {
        return "Chiều dài: " + this.length +"cm" + ", " + "Chiều rộng: " + this.width + "cm";
    }

    public int area() {
        return (this.length * this.width);
    }

    public int perimeter() {
        return (this.length + this.width) * 2;
    }
}
