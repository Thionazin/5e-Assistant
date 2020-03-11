/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5eassistant.Client;

/**
 *
 * @author wywang
 */
public class SessionMap {
    String name;
    MapTile[][] layout;
    
    
    public SessionMap(String mapName, int rows, int columns)
    {
        name = mapName;
        layout = new MapTile[rows][columns];
    }
    
    public MapTile getTile(int row, int col)
    {
        return layout[row][col];
    }
    
    public void setTile(MapTile tile, int row, int col)
    {
        layout[row][col] = tile;
    }
}
