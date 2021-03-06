package by.itstep.internetShop.dao.entity;

import javax.validation.constraints.Size;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @Size(min = 3, max = 50)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @OneToMany(mappedBy = "productId")
    private Set<Item> items;

    public Product() {
    }

    public Product(Long id, @Size(min = 3, max = 50) String name, String description, Double price, Set<Item> items) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description) &&
                Objects.equals(price, product.price) &&
                Objects.equals(items, product.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price, items);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", items=" + items +
                '}';
    }
}