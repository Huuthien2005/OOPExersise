package exer1;

abstract class Shape {
    private String name;
    public Shape(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract String toString();
    public abstract double getArea();
    public abstract double getPerimeter();
}
