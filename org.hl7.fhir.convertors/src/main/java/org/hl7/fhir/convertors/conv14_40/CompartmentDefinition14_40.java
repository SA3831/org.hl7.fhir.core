package org.hl7.fhir.convertors.conv14_40;

import org.hl7.fhir.convertors.VersionConvertor_14_40;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.StringType;

import java.util.Collections;

public class CompartmentDefinition14_40 {

    public static org.hl7.fhir.r4.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.dstu2016may.model.CompartmentDefinition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.CompartmentDefinition tgt = new org.hl7.fhir.r4.model.CompartmentDefinition();
        VersionConvertor_14_40.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.r4.model.UriType) VersionConvertor_14_40.convertType(src.getUrlElement()));
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasStatus()) {
            tgt.setStatus(VersionConvertor_14_40.convertConformanceResourceStatus(src.getStatus()));
        }
        if (src.hasExperimentalElement())
            tgt.setExperimentalElement((org.hl7.fhir.r4.model.BooleanType) VersionConvertor_14_40.convertType(src.getExperimentalElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_14_40.convertType(src.getPublisherElement()));
        if (src.hasContact()) {
            for (org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent t : src.getContact()) tgt.addContact(convertCompartmentDefinitionContactComponent(t));
        }
        if (src.hasDateElement())
            tgt.setDateElement((org.hl7.fhir.r4.model.DateTimeType) VersionConvertor_14_40.convertType(src.getDateElement()));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        if (src.hasRequirements())
            tgt.setPurpose(src.getRequirements());
        if (src.hasCode()) {
            tgt.setCode(convertCompartmentType(src.getCode()));
        }
        if (src.hasSearchElement())
            tgt.setSearchElement((org.hl7.fhir.r4.model.BooleanType) VersionConvertor_14_40.convertType(src.getSearchElement()));
        if (src.hasResource()) {
            for (org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource()) tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.r4.model.CompartmentDefinition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CompartmentDefinition tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition();
        VersionConvertor_14_40.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.dstu2016may.model.UriType) VersionConvertor_14_40.convertType(src.getUrlElement()));
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasStatus()) {
            tgt.setStatus(VersionConvertor_14_40.convertConformanceResourceStatus(src.getStatus()));
        }
        if (src.hasExperimentalElement())
            tgt.setExperimentalElement((org.hl7.fhir.dstu2016may.model.BooleanType) VersionConvertor_14_40.convertType(src.getExperimentalElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getPublisherElement()));
        if (src.hasContact()) {
            for (org.hl7.fhir.r4.model.ContactDetail t : src.getContact()) tgt.addContact(convertCompartmentDefinitionContactComponent(t));
        }
        if (src.hasDateElement())
            tgt.setDateElement((org.hl7.fhir.dstu2016may.model.DateTimeType) VersionConvertor_14_40.convertType(src.getDateElement()));
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getDescriptionElement()));
        if (src.hasPurpose())
            tgt.setRequirements(src.getPurpose());
        if (src.hasCode()) {
            tgt.setCode(convertCompartmentType(src.getCode()));
        }
        if (src.hasSearchElement())
            tgt.setSearchElement((org.hl7.fhir.dstu2016may.model.BooleanType) VersionConvertor_14_40.convertType(src.getSearchElement()));
        if (src.hasResource()) {
            for (org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource()) tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.ContactDetail convertCompartmentDefinitionContactComponent(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.ContactDetail tgt = new org.hl7.fhir.r4.model.ContactDetail();
        VersionConvertor_14_40.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_40.convertContactPoint(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent convertCompartmentDefinitionContactComponent(org.hl7.fhir.r4.model.ContactDetail src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent();
        VersionConvertor_14_40.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.r4.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_40.convertContactPoint(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
        VersionConvertor_14_40.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement((org.hl7.fhir.r4.model.CodeType) VersionConvertor_14_40.convertType(src.getCodeElement()));
        if (src.hasParam()) {
            for (org.hl7.fhir.dstu2016may.model.StringType t : src.getParam()) tgt.addParam(t.getValue());
        }
        if (src.hasDocumentationElement())
            tgt.setDocumentationElement((org.hl7.fhir.r4.model.StringType) VersionConvertor_14_40.convertType(src.getDocumentationElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
        VersionConvertor_14_40.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement((org.hl7.fhir.dstu2016may.model.CodeType) VersionConvertor_14_40.convertType(src.getCodeElement()));
        if (src.hasParam()) {
            for (org.hl7.fhir.r4.model.StringType t : src.getParam()) tgt.addParam(t.getValue());
        }
        if (src.hasDocumentationElement())
            tgt.setDocumentationElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getDocumentationElement()));
        return tgt;
    }

    static public org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType convertCompartmentType(org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PATIENT:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.PATIENT;
            case ENCOUNTER:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.ENCOUNTER;
            case RELATEDPERSON:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.RELATEDPERSON;
            case PRACTITIONER:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.PRACTITIONER;
            case DEVICE:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.DEVICE;
            default:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType convertCompartmentType(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PATIENT:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.PATIENT;
            case ENCOUNTER:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.ENCOUNTER;
            case RELATEDPERSON:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.RELATEDPERSON;
            case PRACTITIONER:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.PRACTITIONER;
            case DEVICE:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.DEVICE;
            default:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.NULL;
        }
    }
}
