package com.ryannm.android.ankimate.Dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "CONFIGURATION".
 */
public class Configuration {

    private Long id;
    private String name;
    private String tagsToFetch;
    private String tagsToSave;
    private Long modelId;
    private Long deckId;
    private String fields;
    private String fieldKeywords;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Configuration() {
    }

    public Configuration(Long id) {
        this.id = id;
    }

    public Configuration(Long id, String name, String tagsToFetch, String tagsToSave, Long modelId, Long deckId, String fields, String fieldKeywords) {
        this.id = id;
        this.name = name;
        this.tagsToFetch = tagsToFetch;
        this.tagsToSave = tagsToSave;
        this.modelId = modelId;
        this.deckId = deckId;
        this.fields = fields;
        this.fieldKeywords = fieldKeywords;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagsToFetch() {
        return tagsToFetch;
    }

    public void setTagsToFetch(String tagsToFetch) {
        this.tagsToFetch = tagsToFetch;
    }

    public String getTagsToSave() {
        return tagsToSave;
    }

    public void setTagsToSave(String tagsToSave) {
        this.tagsToSave = tagsToSave;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getDeckId() {
        return deckId;
    }

    public void setDeckId(Long deckId) {
        this.deckId = deckId;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFieldKeywords() {
        return fieldKeywords;
    }

    public void setFieldKeywords(String fieldKeywords) {
        this.fieldKeywords = fieldKeywords;
    }

    // KEEP METHODS - put your custom methods here


    // KEEP METHODS END

}
