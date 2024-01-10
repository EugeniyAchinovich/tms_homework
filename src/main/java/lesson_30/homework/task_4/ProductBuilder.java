package lesson_30.homework.task_4;

public class ProductBuilder implements Builder {
    private String field1;
    private int field2;

    public Builder setField1(String field1) {
        this.field1 = field1;
        return this;
    }

    public Builder setField2(int field2) {
        this.field2 = field2;
        return this;
    }

    public Product build() {
        return new Product(field1, field2);
    }
}

