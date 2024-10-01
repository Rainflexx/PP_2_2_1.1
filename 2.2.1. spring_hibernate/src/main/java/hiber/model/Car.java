
package hiber.model;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "сars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int series;
    private String model;
    @OneToOne
    @PrimaryKeyJoinColumn
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car(){

    }
    public Car(int series,String model){
        this.series=series;
        this.model=model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public int getSeries() {
        return series;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Brand - " + model + ". Series - " + series;
    }
}
