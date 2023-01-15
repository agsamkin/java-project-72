package hexlet.code.domain;

import io.ebean.Model;
import io.ebean.annotation.WhenCreated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Entity
public final class Url extends Model {
    @Id
    private long id;

    @WhenCreated
    private Instant createdAt;

    private String name;

    @OneToMany(mappedBy = "url")
    private List<UrlCheck> urlChecks;

    public Url() {
    }

    public Url(String newName) {
        this.name = newName;
    }

    public long getId() {
        return id;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public String getName() {
        return name;
    }

    public List<UrlCheck> getUrlChecks() {
        return urlChecks;
    }
}

