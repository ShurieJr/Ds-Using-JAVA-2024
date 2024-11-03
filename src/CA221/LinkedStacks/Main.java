package CA221.LinkedStacks;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     LinkedStack<String> names = new LinkedStack<>();
     names.push("ali");
     names.push("hawa");
     names.push("Gedi");
     names.push("Warsame");
     names.push("ahmed");

        System.out.println("removed: " + names.pop());
        System.out.println("top: " + names.peek());
        System.out.println("size: " + names.size());
        System.out.println("empty: " + names.isEmpty());
        names.display();
        System.out.println("found : " + names.searchElement("hawa"));
        System.out.println("found : " + names.searchElement("ahmed"));
    }
}