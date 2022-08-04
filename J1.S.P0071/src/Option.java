
import java.util.ArrayList;


public class Option {
    // hiển thị ra cái task
    public void getDataTasks(ArrayList<Task> list) {
        for (Task o : list) {// duyt tu dau đến cuối list
            System.out.println(o);
        }
    }
    // add thêm task mới gồm thuộc tính
    public void addTask(ArrayList<Task> list, int id, String name,int typeid, String date,
            double from, double to,String assing, String review){
        Task t = new Task(id, name, typeid, date, from, to, assing, review);
        list.add(t);
    }
    // xóa đi 1 task
    public void delete(ArrayList<Task> list, int id){
        boolean check = true;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if(id==list.get(i).getId()){ // getid
                list.remove(i);// xóa cái id đó
                check = false;
                index = i;
                System.out.println("Delete an task successful");
                break;
            }
        }
        if(check){
            System.out.println("Delete an task fail");
        }
    }
}
