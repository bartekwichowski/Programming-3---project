/**
 * Created by bartek on 11/6/16.
 */
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class Main {

    public static void main(String[] args)
    {
        Graph graph = new SingleGraph("Tutorial 1");
        System.out.println("Working!\n");
        int k = 2/3;
        /*
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");

        graph.display();
        */
        sGraph myTestGraph = new sGraph();
        myTestGraph.giveNode("first");
        myTestGraph.giveNode("second");
        myTestGraph.displayGraph();
        myTestGraph.testValues();
    }

}
