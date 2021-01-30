package class1;

/**
 * 环形队列
 * front变量含义做调整：front指向队列的第一个元素，也就是说front的初始值为0
 * rear变量的含义做调整：rear指向队列最后一个元素的下一个位置，因为希望空出一个空间作为约定，rear的初始值为0
 * 当队列满时满足条件：（rear+1）% maxSize = front
 * 当队列为空时满足rear == front
 * 队列中有效数据的个数：(rear+maxSize-front) % maxSize
 */

public class CircleQueue_03 {

}
