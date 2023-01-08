class MainClass5 {

    interface Command {
        public void execute();
    }

    static class Fan {
        public void on() {
            System.out.println("Fan is on");
        }

        public void off() {
            System.out.println("Fan is off");
        }
    }

    static class FanOnCommand implements Command {
        Fan f;

        public FanOnCommand(Fan f) {
            this.f = f;
        }

        public void execute() {
            f.on();
        }
    }

    static class FanOffCommand implements Command {
        Fan f;

        public FanOffCommand(Fan f) {
            this.f = f;
        }

        public void execute() {
            f.off();
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
            Fan f1 = new Fan();
            FanOnCommand fo = new FanOnCommand(f1);
            r1.setCommand(fo);

            Fan f2 = new Fan();
            FanOffCommand off = new FanOffCommand(f2);
            r1.setCommand(off);
        }
    }
}
