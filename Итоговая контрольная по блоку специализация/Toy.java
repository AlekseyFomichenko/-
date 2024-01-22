public abstract class Toy {
    private final Integer id;
    private String name;
    private Integer frequency;
    static Integer count = 0;

    public Toy(String name, Integer frequency) {
        this.id = ++count;
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public Integer getId() {
        return id;
    }
}
