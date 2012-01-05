package se.jayway.opengl.tutorial.mesh;

public class Cube extends Mesh {
	public Cube(float width, float height, float depth) {
        width  /= 2;
        height /= 2;
        depth  /= 2;
 
        float vertices[] = { -width, -height, -depth, // 0
                              width, -height, -depth, // 1
                              width,  height, -depth, // 2
                             -width,  height, -depth, // 3
                             -width, -height,  depth, // 4
                              width, -height,  depth, // 5
                              width,  height,  depth, // 6
                             -width,  height,  depth, // 7
        };
 
        short indices[] = { 0, 5, 4,
                            0, 1, 5,
                            1, 6, 5,
                            1, 2, 6,
                            2, 7, 6,
                            2, 3, 7,
                            3, 4, 7,
                            3, 0, 4,
                            4, 6, 7,
                            4, 5, 6,
                            2, 1, 0,
                            2, 0, 3, };
 
        setIndices(indices);
        setVertices(vertices);
        setColors(new float[]{1,0,0,1,//red
        		0,1,0,1,//green
        		0,0,1,1,//blue
        		0,1,1,1,//cyan
        		1,1,0,1,//yellow
        		1,1,1,1,//white
        		0.5f,1,0.5f,1,//dnt remember
        		1,0,1,1//hope its a color!
        });
    }
}
