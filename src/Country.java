public  class Country implements City,Mar,Car,Parentsablle {
    int age;
    String name;
    public Country(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                "Age=" + age +
                        ", Name='" + name + '\'';
    }


    @Override
    public void speciality() {

    }

    @Override
    public void takeaperson() {

    }

    @Override
    public void build() {

    }

    @Override
    public void money() {

    }

    @Override
    public void feed() {

    }

    @Override
    public void play() {

    }
}
