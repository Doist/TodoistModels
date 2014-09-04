package com.todoist.model;

public class BaseFilter extends TodoistObjectWithId {
    public static final String[] COLORS = Colors.FILTER_COLORS;
    public static final int DEFAULT_COLOR = Colors.DEFAULT_FILTER_COLOR;

    private String name;
    private int color;
    private String query;
    private int itemOrder;

    public BaseFilter(long id, String name, int color, String query, int itemOrder, boolean deleted) {
        super(id, deleted);
        this.name = name;
        this.color = color;
        this.query = query;
        this.itemOrder = itemOrder;
    }

    public BaseFilter(long id, String name, String query, int itemOrder) {
        this(id, name, Colors.DEFAULT_FILTER_COLOR, query, itemOrder, false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the color index in {@link #COLORS}.
     */
    public int getColor() {
        return color;
    }

    /**
     * Returns the color index of {@link #COLORS} within the available bounds. If outside those bounds, the default
     * color index is returned.
     */
    public int getColorWithinBounds() {
        if(color < 0 || color > Colors.FILTER_COLORS.length - 1) {
            return Colors.DEFAULT_FILTER_COLOR;
        } else {
            return color;
        }
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(int itemOrder) {
        this.itemOrder = itemOrder;
    }
}
