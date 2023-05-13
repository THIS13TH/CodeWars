package God;

class Human {
    public Human() {
    }
}

class Man extends Human {
    public Man() {
    }
}

class Woman extends Man {
    public Woman() {
    }
}


class God {
    //Basic subclasses - Adam and Eve
    public static Human[] create() {
        Human Adam = new Man();
        Human Eve = new Woman();
        return new Human[]{Adam, Eve};
    }
}
