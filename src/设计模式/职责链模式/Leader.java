package 设计模式.职责链模式;

public abstract class Leader {

    private String position;//岗位

    Leader nextLeader;//下一节点审核人员

    public Leader(String position) {
        super();
        this.position = position;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    //处理请求
    public abstract void process(LeaveRequest leaveRequest);
}