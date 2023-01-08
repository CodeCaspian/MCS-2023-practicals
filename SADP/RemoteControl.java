class MainClass5 {

    interface Command {
        public void execute();
    }

    static class Light {
        public void on() {
            System.out.println("Light is on");
        }
        public void off() {
            System.out.println("Light is off");
        }
    }

    static class LightOnCommand implements Command {
        Light l;
        public LightOnCommand(Light l) {
            this.l = l;
        }
        public void execute() {
            l.on();
        }
    }

    static class LightOffCommand implements Command {
        Light l;
         public LightOffCommand(Light l) {
            this.l = l;
        }
        public void execute() {
            l.off();
        }
    }

    static class SimpleRemoteControl {
        public void setCommand(Command command) {
            command.execute();
        }
    }

    public static class RemoteControl {
        public static void main(String[] args) {
            SimpleRemoteControl r1 = new SimpleRemoteControl();
            Light l1 = new Light();
            LightOnCommand lo = new LightOnCommand(l1);
            r1.setCommand(lo);

            Light l2 = new Light();
            LightOffCommand loff = new LightOffCommand(l2);
            r1.setCommand(loff);
        }
    }
}
