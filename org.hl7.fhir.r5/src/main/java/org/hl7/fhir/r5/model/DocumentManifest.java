package org.hl7.fhir.r5.model;


/*
 * #%L
 * org.hl7.fhir.r5
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the \"License\");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an \"AS IS\" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Thu, Dec 13, 2018 14:07+1100 for FHIR v4.0.0

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * A collection of documents compiled for a purpose together with metadata that applies to the collection.
 */
@ResourceDef(name="DocumentManifest", profile="http://hl7.org/fhir/StructureDefinition/DocumentManifest")
public class DocumentManifest extends DomainResource {

    @Block()
    public static class DocumentManifestRelatedComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.
         */
        @Child(name = "identifier", type = {Identifier.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Identifiers of things that are related", formalDefinition="Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers." )
        protected Identifier identifier;

        /**
         * Related Resource to this DocumentManifest. For example, Order, ServiceRequest,  Procedure, EligibilityRequest, etc.
         */
        @Child(name = "ref", type = {Reference.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Related Resource", formalDefinition="Related Resource to this DocumentManifest. For example, Order, ServiceRequest,  Procedure, EligibilityRequest, etc." )
        protected Reference ref;

        private static final long serialVersionUID = -1464616234L;

    /**
     * Constructor
     */
      public DocumentManifestRelatedComponent() {
        super();
      }

        /**
         * @return {@link #identifier} (Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.)
         */
        public Identifier getIdentifier() { 
          if (this.identifier == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DocumentManifestRelatedComponent.identifier");
            else if (Configuration.doAutoCreate())
              this.identifier = new Identifier(); // cc
          return this.identifier;
        }

        public boolean hasIdentifier() { 
          return this.identifier != null && !this.identifier.isEmpty();
        }

        /**
         * @param value {@link #identifier} (Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.)
         */
        public DocumentManifestRelatedComponent setIdentifier(Identifier value) { 
          this.identifier = value;
          return this;
        }

        /**
         * @return {@link #ref} (Related Resource to this DocumentManifest. For example, Order, ServiceRequest,  Procedure, EligibilityRequest, etc.)
         */
        public Reference getRef() { 
          if (this.ref == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DocumentManifestRelatedComponent.ref");
            else if (Configuration.doAutoCreate())
              this.ref = new Reference(); // cc
          return this.ref;
        }

        public boolean hasRef() { 
          return this.ref != null && !this.ref.isEmpty();
        }

        /**
         * @param value {@link #ref} (Related Resource to this DocumentManifest. For example, Order, ServiceRequest,  Procedure, EligibilityRequest, etc.)
         */
        public DocumentManifestRelatedComponent setRef(Reference value) { 
          this.ref = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("identifier", "Identifier", "Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.", 0, 1, identifier));
          children.add(new Property("ref", "Reference(Any)", "Related Resource to this DocumentManifest. For example, Order, ServiceRequest,  Procedure, EligibilityRequest, etc.", 0, 1, ref));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.", 0, 1, identifier);
          case 112787: /*ref*/  return new Property("ref", "Reference(Any)", "Related Resource to this DocumentManifest. For example, Order, ServiceRequest,  Procedure, EligibilityRequest, etc.", 0, 1, ref);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : new Base[] {this.identifier}; // Identifier
        case 112787: /*ref*/ return this.ref == null ? new Base[0] : new Base[] {this.ref}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.identifier = TypeConvertor.castToIdentifier(value); // Identifier
          return value;
        case 112787: // ref
          this.ref = TypeConvertor.castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.identifier = TypeConvertor.castToIdentifier(value); // Identifier
        } else if (name.equals("ref")) {
          this.ref = TypeConvertor.castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return getIdentifier();
        case 112787:  return getRef();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 112787: /*ref*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          this.identifier = new Identifier();
          return this.identifier;
        }
        else if (name.equals("ref")) {
          this.ref = new Reference();
          return this.ref;
        }
        else
          return super.addChild(name);
      }

      public DocumentManifestRelatedComponent copy() {
        DocumentManifestRelatedComponent dst = new DocumentManifestRelatedComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(DocumentManifestRelatedComponent dst) {
        super.copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.ref = ref == null ? null : ref.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DocumentManifestRelatedComponent))
          return false;
        DocumentManifestRelatedComponent o = (DocumentManifestRelatedComponent) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(ref, o.ref, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DocumentManifestRelatedComponent))
          return false;
        DocumentManifestRelatedComponent o = (DocumentManifestRelatedComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, ref);
      }

  public String fhirType() {
    return "DocumentManifest.related";

  }

  }

    /**
     * A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.
     */
    @Child(name = "masterIdentifier", type = {Identifier.class}, order=0, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Unique Identifier for the set of documents", formalDefinition="A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts." )
    protected Identifier masterIdentifier;

    /**
     * Other identifiers associated with the document manifest, including version independent  identifiers.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Other identifiers for the manifest", formalDefinition="Other identifiers associated with the document manifest, including version independent  identifiers." )
    protected List<Identifier> identifier;

    /**
     * The status of this document manifest.
     */
    @Child(name = "status", type = {CodeType.class}, order=2, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="current | superseded | entered-in-error", formalDefinition="The status of this document manifest." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/document-reference-status")
    protected Enumeration<DocumentReferenceStatus> status;

    /**
     * The code specifying the type of clinical activity that resulted in placing the associated content into the DocumentManifest.
     */
    @Child(name = "type", type = {CodeableConcept.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Kind of document set", formalDefinition="The code specifying the type of clinical activity that resulted in placing the associated content into the DocumentManifest." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/v3-ActCode")
    protected CodeableConcept type;

    /**
     * Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).
     */
    @Child(name = "subject", type = {Patient.class, Practitioner.class, Group.class, Device.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The subject of the set of documents", formalDefinition="Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case)." )
    protected Reference subject;

    /**
     * When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).
     */
    @Child(name = "created", type = {DateTimeType.class}, order=5, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="When this document manifest created", formalDefinition="When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.)." )
    protected DateTimeType created;

    /**
     * Identifies who is the author of the manifest. Manifest author is not necessarly the author of the references included.
     */
    @Child(name = "author", type = {Practitioner.class, PractitionerRole.class, Organization.class, Device.class, Patient.class, RelatedPerson.class}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Who and/or what authored the DocumentManifest", formalDefinition="Identifies who is the author of the manifest. Manifest author is not necessarly the author of the references included." )
    protected List<Reference> author;

    /**
     * A patient, practitioner, or organization for which this set of documents is intended.
     */
    @Child(name = "recipient", type = {Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class, Organization.class}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Intended to get notified about this set of documents", formalDefinition="A patient, practitioner, or organization for which this set of documents is intended." )
    protected List<Reference> recipient;

    /**
     * Identifies the source system, application, or software that produced the document manifest.
     */
    @Child(name = "source", type = {UriType.class}, order=8, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The source system/application/software", formalDefinition="Identifies the source system, application, or software that produced the document manifest." )
    protected UriType source;

    /**
     * Human-readable description of the source document. This is sometimes known as the "title".
     */
    @Child(name = "description", type = {StringType.class}, order=9, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Human-readable description (title)", formalDefinition="Human-readable description of the source document. This is sometimes known as the \"title\"." )
    protected StringType description;

    /**
     * The list of Resources that consist of the parts of this manifest.
     */
    @Child(name = "content", type = {Reference.class}, order=10, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Items in manifest", formalDefinition="The list of Resources that consist of the parts of this manifest." )
    protected List<Reference> content;

    /**
     * Related identifiers or resources associated with the DocumentManifest.
     */
    @Child(name = "related", type = {}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Related things", formalDefinition="Related identifiers or resources associated with the DocumentManifest." )
    protected List<DocumentManifestRelatedComponent> related;

    private static final long serialVersionUID = -1695559473L;

  /**
   * Constructor
   */
    public DocumentManifest() {
      super();
    }

  /**
   * Constructor
   */
    public DocumentManifest(DocumentReferenceStatus status, Reference content) {
      super();
      this.setStatus(status);
      this.addContent(content);
    }

    /**
     * @return {@link #masterIdentifier} (A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.)
     */
    public Identifier getMasterIdentifier() { 
      if (this.masterIdentifier == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DocumentManifest.masterIdentifier");
        else if (Configuration.doAutoCreate())
          this.masterIdentifier = new Identifier(); // cc
      return this.masterIdentifier;
    }

    public boolean hasMasterIdentifier() { 
      return this.masterIdentifier != null && !this.masterIdentifier.isEmpty();
    }

    /**
     * @param value {@link #masterIdentifier} (A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.)
     */
    public DocumentManifest setMasterIdentifier(Identifier value) { 
      this.masterIdentifier = value;
      return this;
    }

    /**
     * @return {@link #identifier} (Other identifiers associated with the document manifest, including version independent  identifiers.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DocumentManifest setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public DocumentManifest addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #status} (The status of this document manifest.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<DocumentReferenceStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DocumentManifest.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<DocumentReferenceStatus>(new DocumentReferenceStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of this document manifest.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public DocumentManifest setStatusElement(Enumeration<DocumentReferenceStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of this document manifest.
     */
    public DocumentReferenceStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this document manifest.
     */
    public DocumentManifest setStatus(DocumentReferenceStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<DocumentReferenceStatus>(new DocumentReferenceStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #type} (The code specifying the type of clinical activity that resulted in placing the associated content into the DocumentManifest.)
     */
    public CodeableConcept getType() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DocumentManifest.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (The code specifying the type of clinical activity that resulted in placing the associated content into the DocumentManifest.)
     */
    public DocumentManifest setType(CodeableConcept value) { 
      this.type = value;
      return this;
    }

    /**
     * @return {@link #subject} (Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).)
     */
    public Reference getSubject() { 
      if (this.subject == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DocumentManifest.subject");
        else if (Configuration.doAutoCreate())
          this.subject = new Reference(); // cc
      return this.subject;
    }

    public boolean hasSubject() { 
      return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).)
     */
    public DocumentManifest setSubject(Reference value) { 
      this.subject = value;
      return this;
    }

    /**
     * @return {@link #created} (When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() { 
      if (this.created == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DocumentManifest.created");
        else if (Configuration.doAutoCreate())
          this.created = new DateTimeType(); // bb
      return this.created;
    }

    public boolean hasCreatedElement() { 
      return this.created != null && !this.created.isEmpty();
    }

    public boolean hasCreated() { 
      return this.created != null && !this.created.isEmpty();
    }

    /**
     * @param value {@link #created} (When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DocumentManifest setCreatedElement(DateTimeType value) { 
      this.created = value;
      return this;
    }

    /**
     * @return When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).
     */
    public Date getCreated() { 
      return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).
     */
    public DocumentManifest setCreated(Date value) { 
      if (value == null)
        this.created = null;
      else {
        if (this.created == null)
          this.created = new DateTimeType();
        this.created.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #author} (Identifies who is the author of the manifest. Manifest author is not necessarly the author of the references included.)
     */
    public List<Reference> getAuthor() { 
      if (this.author == null)
        this.author = new ArrayList<Reference>();
      return this.author;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DocumentManifest setAuthor(List<Reference> theAuthor) { 
      this.author = theAuthor;
      return this;
    }

    public boolean hasAuthor() { 
      if (this.author == null)
        return false;
      for (Reference item : this.author)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addAuthor() { //3
      Reference t = new Reference();
      if (this.author == null)
        this.author = new ArrayList<Reference>();
      this.author.add(t);
      return t;
    }

    public DocumentManifest addAuthor(Reference t) { //3
      if (t == null)
        return this;
      if (this.author == null)
        this.author = new ArrayList<Reference>();
      this.author.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #author}, creating it if it does not already exist {3}
     */
    public Reference getAuthorFirstRep() { 
      if (getAuthor().isEmpty()) {
        addAuthor();
      }
      return getAuthor().get(0);
    }

    /**
     * @return {@link #recipient} (A patient, practitioner, or organization for which this set of documents is intended.)
     */
    public List<Reference> getRecipient() { 
      if (this.recipient == null)
        this.recipient = new ArrayList<Reference>();
      return this.recipient;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DocumentManifest setRecipient(List<Reference> theRecipient) { 
      this.recipient = theRecipient;
      return this;
    }

    public boolean hasRecipient() { 
      if (this.recipient == null)
        return false;
      for (Reference item : this.recipient)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addRecipient() { //3
      Reference t = new Reference();
      if (this.recipient == null)
        this.recipient = new ArrayList<Reference>();
      this.recipient.add(t);
      return t;
    }

    public DocumentManifest addRecipient(Reference t) { //3
      if (t == null)
        return this;
      if (this.recipient == null)
        this.recipient = new ArrayList<Reference>();
      this.recipient.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #recipient}, creating it if it does not already exist {3}
     */
    public Reference getRecipientFirstRep() { 
      if (getRecipient().isEmpty()) {
        addRecipient();
      }
      return getRecipient().get(0);
    }

    /**
     * @return {@link #source} (Identifies the source system, application, or software that produced the document manifest.). This is the underlying object with id, value and extensions. The accessor "getSource" gives direct access to the value
     */
    public UriType getSourceElement() { 
      if (this.source == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DocumentManifest.source");
        else if (Configuration.doAutoCreate())
          this.source = new UriType(); // bb
      return this.source;
    }

    public boolean hasSourceElement() { 
      return this.source != null && !this.source.isEmpty();
    }

    public boolean hasSource() { 
      return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (Identifies the source system, application, or software that produced the document manifest.). This is the underlying object with id, value and extensions. The accessor "getSource" gives direct access to the value
     */
    public DocumentManifest setSourceElement(UriType value) { 
      this.source = value;
      return this;
    }

    /**
     * @return Identifies the source system, application, or software that produced the document manifest.
     */
    public String getSource() { 
      return this.source == null ? null : this.source.getValue();
    }

    /**
     * @param value Identifies the source system, application, or software that produced the document manifest.
     */
    public DocumentManifest setSource(String value) { 
      if (Utilities.noString(value))
        this.source = null;
      else {
        if (this.source == null)
          this.source = new UriType();
        this.source.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #description} (Human-readable description of the source document. This is sometimes known as the "title".). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DocumentManifest.description");
        else if (Configuration.doAutoCreate())
          this.description = new StringType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() { 
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() { 
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (Human-readable description of the source document. This is sometimes known as the "title".). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public DocumentManifest setDescriptionElement(StringType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return Human-readable description of the source document. This is sometimes known as the "title".
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Human-readable description of the source document. This is sometimes known as the "title".
     */
    public DocumentManifest setDescription(String value) { 
      if (Utilities.noString(value))
        this.description = null;
      else {
        if (this.description == null)
          this.description = new StringType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #content} (The list of Resources that consist of the parts of this manifest.)
     */
    public List<Reference> getContent() { 
      if (this.content == null)
        this.content = new ArrayList<Reference>();
      return this.content;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DocumentManifest setContent(List<Reference> theContent) { 
      this.content = theContent;
      return this;
    }

    public boolean hasContent() { 
      if (this.content == null)
        return false;
      for (Reference item : this.content)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addContent() { //3
      Reference t = new Reference();
      if (this.content == null)
        this.content = new ArrayList<Reference>();
      this.content.add(t);
      return t;
    }

    public DocumentManifest addContent(Reference t) { //3
      if (t == null)
        return this;
      if (this.content == null)
        this.content = new ArrayList<Reference>();
      this.content.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #content}, creating it if it does not already exist {3}
     */
    public Reference getContentFirstRep() { 
      if (getContent().isEmpty()) {
        addContent();
      }
      return getContent().get(0);
    }

    /**
     * @return {@link #related} (Related identifiers or resources associated with the DocumentManifest.)
     */
    public List<DocumentManifestRelatedComponent> getRelated() { 
      if (this.related == null)
        this.related = new ArrayList<DocumentManifestRelatedComponent>();
      return this.related;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DocumentManifest setRelated(List<DocumentManifestRelatedComponent> theRelated) { 
      this.related = theRelated;
      return this;
    }

    public boolean hasRelated() { 
      if (this.related == null)
        return false;
      for (DocumentManifestRelatedComponent item : this.related)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public DocumentManifestRelatedComponent addRelated() { //3
      DocumentManifestRelatedComponent t = new DocumentManifestRelatedComponent();
      if (this.related == null)
        this.related = new ArrayList<DocumentManifestRelatedComponent>();
      this.related.add(t);
      return t;
    }

    public DocumentManifest addRelated(DocumentManifestRelatedComponent t) { //3
      if (t == null)
        return this;
      if (this.related == null)
        this.related = new ArrayList<DocumentManifestRelatedComponent>();
      this.related.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #related}, creating it if it does not already exist {3}
     */
    public DocumentManifestRelatedComponent getRelatedFirstRep() { 
      if (getRelated().isEmpty()) {
        addRelated();
      }
      return getRelated().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("masterIdentifier", "Identifier", "A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.", 0, 1, masterIdentifier));
        children.add(new Property("identifier", "Identifier", "Other identifiers associated with the document manifest, including version independent  identifiers.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("status", "code", "The status of this document manifest.", 0, 1, status));
        children.add(new Property("type", "CodeableConcept", "The code specifying the type of clinical activity that resulted in placing the associated content into the DocumentManifest.", 0, 1, type));
        children.add(new Property("subject", "Reference(Patient|Practitioner|Group|Device)", "Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).", 0, 1, subject));
        children.add(new Property("created", "dateTime", "When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).", 0, 1, created));
        children.add(new Property("author", "Reference(Practitioner|PractitionerRole|Organization|Device|Patient|RelatedPerson)", "Identifies who is the author of the manifest. Manifest author is not necessarly the author of the references included.", 0, java.lang.Integer.MAX_VALUE, author));
        children.add(new Property("recipient", "Reference(Patient|Practitioner|PractitionerRole|RelatedPerson|Organization)", "A patient, practitioner, or organization for which this set of documents is intended.", 0, java.lang.Integer.MAX_VALUE, recipient));
        children.add(new Property("source", "uri", "Identifies the source system, application, or software that produced the document manifest.", 0, 1, source));
        children.add(new Property("description", "string", "Human-readable description of the source document. This is sometimes known as the \"title\".", 0, 1, description));
        children.add(new Property("content", "Reference(Any)", "The list of Resources that consist of the parts of this manifest.", 0, java.lang.Integer.MAX_VALUE, content));
        children.add(new Property("related", "", "Related identifiers or resources associated with the DocumentManifest.", 0, java.lang.Integer.MAX_VALUE, related));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 243769515: /*masterIdentifier*/  return new Property("masterIdentifier", "Identifier", "A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.", 0, 1, masterIdentifier);
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "Other identifiers associated with the document manifest, including version independent  identifiers.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -892481550: /*status*/  return new Property("status", "code", "The status of this document manifest.", 0, 1, status);
        case 3575610: /*type*/  return new Property("type", "CodeableConcept", "The code specifying the type of clinical activity that resulted in placing the associated content into the DocumentManifest.", 0, 1, type);
        case -1867885268: /*subject*/  return new Property("subject", "Reference(Patient|Practitioner|Group|Device)", "Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).", 0, 1, subject);
        case 1028554472: /*created*/  return new Property("created", "dateTime", "When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).", 0, 1, created);
        case -1406328437: /*author*/  return new Property("author", "Reference(Practitioner|PractitionerRole|Organization|Device|Patient|RelatedPerson)", "Identifies who is the author of the manifest. Manifest author is not necessarly the author of the references included.", 0, java.lang.Integer.MAX_VALUE, author);
        case 820081177: /*recipient*/  return new Property("recipient", "Reference(Patient|Practitioner|PractitionerRole|RelatedPerson|Organization)", "A patient, practitioner, or organization for which this set of documents is intended.", 0, java.lang.Integer.MAX_VALUE, recipient);
        case -896505829: /*source*/  return new Property("source", "uri", "Identifies the source system, application, or software that produced the document manifest.", 0, 1, source);
        case -1724546052: /*description*/  return new Property("description", "string", "Human-readable description of the source document. This is sometimes known as the \"title\".", 0, 1, description);
        case 951530617: /*content*/  return new Property("content", "Reference(Any)", "The list of Resources that consist of the parts of this manifest.", 0, java.lang.Integer.MAX_VALUE, content);
        case 1090493483: /*related*/  return new Property("related", "", "Related identifiers or resources associated with the DocumentManifest.", 0, java.lang.Integer.MAX_VALUE, related);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 243769515: /*masterIdentifier*/ return this.masterIdentifier == null ? new Base[0] : new Base[] {this.masterIdentifier}; // Identifier
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<DocumentReferenceStatus>
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -1867885268: /*subject*/ return this.subject == null ? new Base[0] : new Base[] {this.subject}; // Reference
        case 1028554472: /*created*/ return this.created == null ? new Base[0] : new Base[] {this.created}; // DateTimeType
        case -1406328437: /*author*/ return this.author == null ? new Base[0] : this.author.toArray(new Base[this.author.size()]); // Reference
        case 820081177: /*recipient*/ return this.recipient == null ? new Base[0] : this.recipient.toArray(new Base[this.recipient.size()]); // Reference
        case -896505829: /*source*/ return this.source == null ? new Base[0] : new Base[] {this.source}; // UriType
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 951530617: /*content*/ return this.content == null ? new Base[0] : this.content.toArray(new Base[this.content.size()]); // Reference
        case 1090493483: /*related*/ return this.related == null ? new Base[0] : this.related.toArray(new Base[this.related.size()]); // DocumentManifestRelatedComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 243769515: // masterIdentifier
          this.masterIdentifier = TypeConvertor.castToIdentifier(value); // Identifier
          return value;
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case -892481550: // status
          value = new DocumentReferenceStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<DocumentReferenceStatus>
          return value;
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1867885268: // subject
          this.subject = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1028554472: // created
          this.created = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case -1406328437: // author
          this.getAuthor().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 820081177: // recipient
          this.getRecipient().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -896505829: // source
          this.source = TypeConvertor.castToUri(value); // UriType
          return value;
        case -1724546052: // description
          this.description = TypeConvertor.castToString(value); // StringType
          return value;
        case 951530617: // content
          this.getContent().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 1090493483: // related
          this.getRelated().add((DocumentManifestRelatedComponent) value); // DocumentManifestRelatedComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("masterIdentifier")) {
          this.masterIdentifier = TypeConvertor.castToIdentifier(value); // Identifier
        } else if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("status")) {
          value = new DocumentReferenceStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<DocumentReferenceStatus>
        } else if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("subject")) {
          this.subject = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("created")) {
          this.created = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("author")) {
          this.getAuthor().add(TypeConvertor.castToReference(value));
        } else if (name.equals("recipient")) {
          this.getRecipient().add(TypeConvertor.castToReference(value));
        } else if (name.equals("source")) {
          this.source = TypeConvertor.castToUri(value); // UriType
        } else if (name.equals("description")) {
          this.description = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("content")) {
          this.getContent().add(TypeConvertor.castToReference(value));
        } else if (name.equals("related")) {
          this.getRelated().add((DocumentManifestRelatedComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 243769515:  return getMasterIdentifier();
        case -1618432855:  return addIdentifier(); 
        case -892481550:  return getStatusElement();
        case 3575610:  return getType();
        case -1867885268:  return getSubject();
        case 1028554472:  return getCreatedElement();
        case -1406328437:  return addAuthor(); 
        case 820081177:  return addRecipient(); 
        case -896505829:  return getSourceElement();
        case -1724546052:  return getDescriptionElement();
        case 951530617:  return addContent(); 
        case 1090493483:  return addRelated(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 243769515: /*masterIdentifier*/ return new String[] {"Identifier"};
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -1867885268: /*subject*/ return new String[] {"Reference"};
        case 1028554472: /*created*/ return new String[] {"dateTime"};
        case -1406328437: /*author*/ return new String[] {"Reference"};
        case 820081177: /*recipient*/ return new String[] {"Reference"};
        case -896505829: /*source*/ return new String[] {"uri"};
        case -1724546052: /*description*/ return new String[] {"string"};
        case 951530617: /*content*/ return new String[] {"Reference"};
        case 1090493483: /*related*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("masterIdentifier")) {
          this.masterIdentifier = new Identifier();
          return this.masterIdentifier;
        }
        else if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type DocumentManifest.status");
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("subject")) {
          this.subject = new Reference();
          return this.subject;
        }
        else if (name.equals("created")) {
          throw new FHIRException("Cannot call addChild on a primitive type DocumentManifest.created");
        }
        else if (name.equals("author")) {
          return addAuthor();
        }
        else if (name.equals("recipient")) {
          return addRecipient();
        }
        else if (name.equals("source")) {
          throw new FHIRException("Cannot call addChild on a primitive type DocumentManifest.source");
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type DocumentManifest.description");
        }
        else if (name.equals("content")) {
          return addContent();
        }
        else if (name.equals("related")) {
          return addRelated();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "DocumentManifest";

  }

      public DocumentManifest copy() {
        DocumentManifest dst = new DocumentManifest();
        copyValues(dst);
        return dst;
      }

      public void copyValues(DocumentManifest dst) {
        super.copyValues(dst);
        dst.masterIdentifier = masterIdentifier == null ? null : masterIdentifier.copy();
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        dst.type = type == null ? null : type.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.created = created == null ? null : created.copy();
        if (author != null) {
          dst.author = new ArrayList<Reference>();
          for (Reference i : author)
            dst.author.add(i.copy());
        };
        if (recipient != null) {
          dst.recipient = new ArrayList<Reference>();
          for (Reference i : recipient)
            dst.recipient.add(i.copy());
        };
        dst.source = source == null ? null : source.copy();
        dst.description = description == null ? null : description.copy();
        if (content != null) {
          dst.content = new ArrayList<Reference>();
          for (Reference i : content)
            dst.content.add(i.copy());
        };
        if (related != null) {
          dst.related = new ArrayList<DocumentManifestRelatedComponent>();
          for (DocumentManifestRelatedComponent i : related)
            dst.related.add(i.copy());
        };
      }

      protected DocumentManifest typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DocumentManifest))
          return false;
        DocumentManifest o = (DocumentManifest) other_;
        return compareDeep(masterIdentifier, o.masterIdentifier, true) && compareDeep(identifier, o.identifier, true)
           && compareDeep(status, o.status, true) && compareDeep(type, o.type, true) && compareDeep(subject, o.subject, true)
           && compareDeep(created, o.created, true) && compareDeep(author, o.author, true) && compareDeep(recipient, o.recipient, true)
           && compareDeep(source, o.source, true) && compareDeep(description, o.description, true) && compareDeep(content, o.content, true)
           && compareDeep(related, o.related, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DocumentManifest))
          return false;
        DocumentManifest o = (DocumentManifest) other_;
        return compareValues(status, o.status, true) && compareValues(created, o.created, true) && compareValues(source, o.source, true)
           && compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(masterIdentifier, identifier
          , status, type, subject, created, author, recipient, source, description, content
          , related);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.DocumentManifest;
   }

 /**
   * Search parameter: <b>author</b>
   * <p>
   * Description: <b>Who and/or what authored the DocumentManifest</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DocumentManifest.author</b><br>
   * </p>
   */
  @SearchParamDefinition(name="author", path="DocumentManifest.author", description="Who and/or what authored the DocumentManifest", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Device"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for RelatedPerson") }, target={Device.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_AUTHOR = "author";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>author</b>
   * <p>
   * Description: <b>Who and/or what authored the DocumentManifest</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DocumentManifest.author</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam AUTHOR = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_AUTHOR);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DocumentManifest:author</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_AUTHOR = new ca.uhn.fhir.model.api.Include("DocumentManifest:author").toLocked();

 /**
   * Search parameter: <b>created</b>
   * <p>
   * Description: <b>When this document manifest created</b><br>
   * Type: <b>date</b><br>
   * Path: <b>DocumentManifest.created</b><br>
   * </p>
   */
  @SearchParamDefinition(name="created", path="DocumentManifest.created", description="When this document manifest created", type="date" )
  public static final String SP_CREATED = "created";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>created</b>
   * <p>
   * Description: <b>When this document manifest created</b><br>
   * Type: <b>date</b><br>
   * Path: <b>DocumentManifest.created</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam CREATED = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_CREATED);

 /**
   * Search parameter: <b>description</b>
   * <p>
   * Description: <b>Human-readable description (title)</b><br>
   * Type: <b>string</b><br>
   * Path: <b>DocumentManifest.description</b><br>
   * </p>
   */
  @SearchParamDefinition(name="description", path="DocumentManifest.description", description="Human-readable description (title)", type="string" )
  public static final String SP_DESCRIPTION = "description";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>description</b>
   * <p>
   * Description: <b>Human-readable description (title)</b><br>
   * Type: <b>string</b><br>
   * Path: <b>DocumentManifest.description</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DESCRIPTION = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_DESCRIPTION);

 /**
   * Search parameter: <b>item</b>
   * <p>
   * Description: <b>Items in manifest</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DocumentManifest.content</b><br>
   * </p>
   */
  @SearchParamDefinition(name="item", path="DocumentManifest.content", description="Items in manifest", type="reference", target={Account.class, ActivityDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CapabilityStatement2.class, CarePlan.class, CareTeam.class, CatalogEntry.class, ChargeItem.class, ChargeItemDefinition.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseIssue.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceDefinition.class, DeviceMetric.class, DeviceRequest.class, DeviceUseStatement.class, DiagnosticReport.class, DocumentManifest.class, DocumentReference.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationUsage.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestGroup.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestReport.class, TestScript.class, Topic.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_ITEM = "item";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>item</b>
   * <p>
   * Description: <b>Items in manifest</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DocumentManifest.content</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ITEM = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ITEM);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DocumentManifest:item</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ITEM = new ca.uhn.fhir.model.api.Include("DocumentManifest:item").toLocked();

 /**
   * Search parameter: <b>recipient</b>
   * <p>
   * Description: <b>Intended to get notified about this set of documents</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DocumentManifest.recipient</b><br>
   * </p>
   */
  @SearchParamDefinition(name="recipient", path="DocumentManifest.recipient", description="Intended to get notified about this set of documents", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for RelatedPerson") }, target={Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_RECIPIENT = "recipient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>recipient</b>
   * <p>
   * Description: <b>Intended to get notified about this set of documents</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DocumentManifest.recipient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam RECIPIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_RECIPIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DocumentManifest:recipient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_RECIPIENT = new ca.uhn.fhir.model.api.Include("DocumentManifest:recipient").toLocked();

 /**
   * Search parameter: <b>related-id</b>
   * <p>
   * Description: <b>Identifiers of things that are related</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DocumentManifest.related.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="related-id", path="DocumentManifest.related.identifier", description="Identifiers of things that are related", type="token" )
  public static final String SP_RELATED_ID = "related-id";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>related-id</b>
   * <p>
   * Description: <b>Identifiers of things that are related</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DocumentManifest.related.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam RELATED_ID = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_RELATED_ID);

 /**
   * Search parameter: <b>related-ref</b>
   * <p>
   * Description: <b>Related Resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DocumentManifest.related.ref</b><br>
   * </p>
   */
  @SearchParamDefinition(name="related-ref", path="DocumentManifest.related.ref", description="Related Resource", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Encounter") }, target={Account.class, ActivityDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CapabilityStatement2.class, CarePlan.class, CareTeam.class, CatalogEntry.class, ChargeItem.class, ChargeItemDefinition.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseIssue.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceDefinition.class, DeviceMetric.class, DeviceRequest.class, DeviceUseStatement.class, DiagnosticReport.class, DocumentManifest.class, DocumentReference.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationUsage.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestGroup.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestReport.class, TestScript.class, Topic.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_RELATED_REF = "related-ref";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>related-ref</b>
   * <p>
   * Description: <b>Related Resource</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DocumentManifest.related.ref</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam RELATED_REF = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_RELATED_REF);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DocumentManifest:related-ref</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_RELATED_REF = new ca.uhn.fhir.model.api.Include("DocumentManifest:related-ref").toLocked();

 /**
   * Search parameter: <b>source</b>
   * <p>
   * Description: <b>The source system/application/software</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>DocumentManifest.source</b><br>
   * </p>
   */
  @SearchParamDefinition(name="source", path="DocumentManifest.source", description="The source system/application/software", type="uri" )
  public static final String SP_SOURCE = "source";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>source</b>
   * <p>
   * Description: <b>The source system/application/software</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>DocumentManifest.source</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.UriClientParam SOURCE = new ca.uhn.fhir.rest.gclient.UriClientParam(SP_SOURCE);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>current | superseded | entered-in-error</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DocumentManifest.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="DocumentManifest.status", description="current | superseded | entered-in-error", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>current | superseded | entered-in-error</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DocumentManifest.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>subject</b>
   * <p>
   * Description: <b>The subject of the set of documents</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DocumentManifest.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name="subject", path="DocumentManifest.subject", description="The subject of the set of documents", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Device"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner") }, target={Device.class, Group.class, Patient.class, Practitioner.class } )
  public static final String SP_SUBJECT = "subject";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>subject</b>
   * <p>
   * Description: <b>The subject of the set of documents</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DocumentManifest.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUBJECT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_SUBJECT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DocumentManifest:subject</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUBJECT = new ca.uhn.fhir.model.api.Include("DocumentManifest:subject").toLocked();

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): External ids for this item
* [CarePlan](careplan.html): External Ids for this plan
* [CareTeam](careteam.html): External Ids for this team
* [Composition](composition.html): Version-independent identifier for the Composition
* [Condition](condition.html): A unique identifier of the condition record
* [Consent](consent.html): Identifier for this record (external references)
* [DetectedIssue](detectedissue.html): Unique id for the detected issue
* [DeviceRequest](devicerequest.html): Business identifier for request/order
* [DiagnosticReport](diagnosticreport.html): An identifier for the report
* [DocumentManifest](documentmanifest.html): Unique Identifier for the set of documents
* [DocumentReference](documentreference.html): Master Version Specific Identifier
* [Encounter](encounter.html): Identifier(s) by which this encounter is known
* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare
* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier
* [Goal](goal.html): External Ids for this goal
* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID and Accession number
* [Immunization](immunization.html): Business identifier
* [List](list.html): Business identifier
* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier
* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier
* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier
* [MedicationUsage](medicationusage.html): Return statements with this external identifier
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier
* [Observation](observation.html): The unique id for a particular observation
* [Procedure](procedure.html): A unique identifier for a procedure
* [RiskAssessment](riskassessment.html): Unique identifier for the assessment
* [ServiceRequest](servicerequest.html): Identifiers assigned to this order
* [SupplyDelivery](supplydelivery.html): External identifier
* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest
* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.identifier | CarePlan.identifier | CareTeam.identifier | Composition.identifier | Condition.identifier | Consent.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DiagnosticReport.identifier | DocumentManifest.masterIdentifier | DocumentManifest.identifier | DocumentReference.masterIdentifier | DocumentReference.identifier | Encounter.identifier | EpisodeOfCare.identifier | FamilyMemberHistory.identifier | Goal.identifier | ImagingStudy.identifier | Immunization.identifier | List.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationUsage.identifier | NutritionOrder.identifier | Observation.identifier | Procedure.identifier | RiskAssessment.identifier | ServiceRequest.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | VisionPrescription.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="AllergyIntolerance.identifier | CarePlan.identifier | CareTeam.identifier | Composition.identifier | Condition.identifier | Consent.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DiagnosticReport.identifier | DocumentManifest.masterIdentifier | DocumentManifest.identifier | DocumentReference.masterIdentifier | DocumentReference.identifier | Encounter.identifier | EpisodeOfCare.identifier | FamilyMemberHistory.identifier | Goal.identifier | ImagingStudy.identifier | Immunization.identifier | List.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationUsage.identifier | NutritionOrder.identifier | Observation.identifier | Procedure.identifier | RiskAssessment.identifier | ServiceRequest.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | VisionPrescription.identifier", description="Multiple Resources: \r\n\r\n* [AllergyIntolerance](allergyintolerance.html): External ids for this item\r\n* [CarePlan](careplan.html): External Ids for this plan\r\n* [CareTeam](careteam.html): External Ids for this team\r\n* [Composition](composition.html): Version-independent identifier for the Composition\r\n* [Condition](condition.html): A unique identifier of the condition record\r\n* [Consent](consent.html): Identifier for this record (external references)\r\n* [DetectedIssue](detectedissue.html): Unique id for the detected issue\r\n* [DeviceRequest](devicerequest.html): Business identifier for request/order\r\n* [DiagnosticReport](diagnosticreport.html): An identifier for the report\r\n* [DocumentManifest](documentmanifest.html): Unique Identifier for the set of documents\r\n* [DocumentReference](documentreference.html): Master Version Specific Identifier\r\n* [Encounter](encounter.html): Identifier(s) by which this encounter is known\r\n* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare\r\n* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier\r\n* [Goal](goal.html): External Ids for this goal\r\n* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID and Accession number\r\n* [Immunization](immunization.html): Business identifier\r\n* [List](list.html): Business identifier\r\n* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier\r\n* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier\r\n* [MedicationUsage](medicationusage.html): Return statements with this external identifier\r\n* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier\r\n* [Observation](observation.html): The unique id for a particular observation\r\n* [Procedure](procedure.html): A unique identifier for a procedure\r\n* [RiskAssessment](riskassessment.html): Unique identifier for the assessment\r\n* [ServiceRequest](servicerequest.html): Identifiers assigned to this order\r\n* [SupplyDelivery](supplydelivery.html): External identifier\r\n* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest\r\n* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier\r\n", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): External ids for this item
* [CarePlan](careplan.html): External Ids for this plan
* [CareTeam](careteam.html): External Ids for this team
* [Composition](composition.html): Version-independent identifier for the Composition
* [Condition](condition.html): A unique identifier of the condition record
* [Consent](consent.html): Identifier for this record (external references)
* [DetectedIssue](detectedissue.html): Unique id for the detected issue
* [DeviceRequest](devicerequest.html): Business identifier for request/order
* [DiagnosticReport](diagnosticreport.html): An identifier for the report
* [DocumentManifest](documentmanifest.html): Unique Identifier for the set of documents
* [DocumentReference](documentreference.html): Master Version Specific Identifier
* [Encounter](encounter.html): Identifier(s) by which this encounter is known
* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare
* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier
* [Goal](goal.html): External Ids for this goal
* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID and Accession number
* [Immunization](immunization.html): Business identifier
* [List](list.html): Business identifier
* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier
* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier
* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier
* [MedicationUsage](medicationusage.html): Return statements with this external identifier
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier
* [Observation](observation.html): The unique id for a particular observation
* [Procedure](procedure.html): A unique identifier for a procedure
* [RiskAssessment](riskassessment.html): Unique identifier for the assessment
* [ServiceRequest](servicerequest.html): Identifiers assigned to this order
* [SupplyDelivery](supplydelivery.html): External identifier
* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest
* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.identifier | CarePlan.identifier | CareTeam.identifier | Composition.identifier | Condition.identifier | Consent.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DiagnosticReport.identifier | DocumentManifest.masterIdentifier | DocumentManifest.identifier | DocumentReference.masterIdentifier | DocumentReference.identifier | Encounter.identifier | EpisodeOfCare.identifier | FamilyMemberHistory.identifier | Goal.identifier | ImagingStudy.identifier | Immunization.identifier | List.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationUsage.identifier | NutritionOrder.identifier | Observation.identifier | Procedure.identifier | RiskAssessment.identifier | ServiceRequest.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | VisionPrescription.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
* [CarePlan](careplan.html): Who the care plan is for
* [CareTeam](careteam.html): Who care team is for
* [ClinicalImpression](clinicalimpression.html): Patient or group assessed
* [Composition](composition.html): Who and/or what the composition is about
* [Condition](condition.html): Who has the condition?
* [Consent](consent.html): Who the consent applies to
* [DetectedIssue](detectedissue.html): Associated patient
* [DeviceRequest](devicerequest.html): Individual the service is ordered for
* [DeviceUseStatement](deviceusestatement.html): Search by subject - a patient
* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient
* [DocumentManifest](documentmanifest.html): The subject of the set of documents
* [DocumentReference](documentreference.html): Who/what is the subject of the document
* [Encounter](encounter.html): The patient or group present at the encounter
* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care
* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for
* [Flag](flag.html): The identity of a subject to list flags for
* [Goal](goal.html): Who this goal is intended for
* [ImagingStudy](imagingstudy.html): Who the study is about
* [Immunization](immunization.html): The patient for the vaccination record
* [List](list.html): If all resources have the same subject
* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for
* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for
* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient
* [MedicationUsage](medicationusage.html): Returns statements for a specific patient.
* [NutritionOrder](nutritionorder.html): The identity of the person who requires the diet, formula or nutritional supplement
* [Observation](observation.html): The subject that the observation is about (if patient)
* [Procedure](procedure.html): Search by subject - a patient
* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
* [ServiceRequest](servicerequest.html): Search by subject - a patient
* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied
* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>AllergyIntolerance.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ClinicalImpression.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.patient | DetectedIssue.patient | DeviceRequest.subject.where(resolve() is Patient) | DeviceUseStatement.subject | DiagnosticReport.subject.where(resolve() is Patient) | DocumentManifest.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EpisodeOfCare.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | List.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationUsage.subject.where(resolve() is Patient) | NutritionOrder.patient | Observation.subject.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | SupplyDelivery.patient | VisionPrescription.patient</b><br>
   * </p>
   */
  @SearchParamDefinition(name="patient", path="AllergyIntolerance.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ClinicalImpression.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.patient | DetectedIssue.patient | DeviceRequest.subject.where(resolve() is Patient) | DeviceUseStatement.subject | DiagnosticReport.subject.where(resolve() is Patient) | DocumentManifest.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EpisodeOfCare.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | List.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationUsage.subject.where(resolve() is Patient) | NutritionOrder.patient | Observation.subject.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | SupplyDelivery.patient | VisionPrescription.patient", description="Multiple Resources: \r\n\r\n* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for\r\n* [CarePlan](careplan.html): Who the care plan is for\r\n* [CareTeam](careteam.html): Who care team is for\r\n* [ClinicalImpression](clinicalimpression.html): Patient or group assessed\r\n* [Composition](composition.html): Who and/or what the composition is about\r\n* [Condition](condition.html): Who has the condition?\r\n* [Consent](consent.html): Who the consent applies to\r\n* [DetectedIssue](detectedissue.html): Associated patient\r\n* [DeviceRequest](devicerequest.html): Individual the service is ordered for\r\n* [DeviceUseStatement](deviceusestatement.html): Search by subject - a patient\r\n* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient\r\n* [DocumentManifest](documentmanifest.html): The subject of the set of documents\r\n* [DocumentReference](documentreference.html): Who/what is the subject of the document\r\n* [Encounter](encounter.html): The patient or group present at the encounter\r\n* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care\r\n* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for\r\n* [Flag](flag.html): The identity of a subject to list flags for\r\n* [Goal](goal.html): Who this goal is intended for\r\n* [ImagingStudy](imagingstudy.html): Who the study is about\r\n* [Immunization](immunization.html): The patient for the vaccination record\r\n* [List](list.html): If all resources have the same subject\r\n* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for\r\n* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for\r\n* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient\r\n* [MedicationUsage](medicationusage.html): Returns statements for a specific patient.\r\n* [NutritionOrder](nutritionorder.html): The identity of the person who requires the diet, formula or nutritional supplement\r\n* [Observation](observation.html): The subject that the observation is about (if patient)\r\n* [Procedure](procedure.html): Search by subject - a patient\r\n* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?\r\n* [ServiceRequest](servicerequest.html): Search by subject - a patient\r\n* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied\r\n* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for\r\n", type="reference", target={Group.class, Patient.class } )
  public static final String SP_PATIENT = "patient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
* [CarePlan](careplan.html): Who the care plan is for
* [CareTeam](careteam.html): Who care team is for
* [ClinicalImpression](clinicalimpression.html): Patient or group assessed
* [Composition](composition.html): Who and/or what the composition is about
* [Condition](condition.html): Who has the condition?
* [Consent](consent.html): Who the consent applies to
* [DetectedIssue](detectedissue.html): Associated patient
* [DeviceRequest](devicerequest.html): Individual the service is ordered for
* [DeviceUseStatement](deviceusestatement.html): Search by subject - a patient
* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient
* [DocumentManifest](documentmanifest.html): The subject of the set of documents
* [DocumentReference](documentreference.html): Who/what is the subject of the document
* [Encounter](encounter.html): The patient or group present at the encounter
* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care
* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for
* [Flag](flag.html): The identity of a subject to list flags for
* [Goal](goal.html): Who this goal is intended for
* [ImagingStudy](imagingstudy.html): Who the study is about
* [Immunization](immunization.html): The patient for the vaccination record
* [List](list.html): If all resources have the same subject
* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for
* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for
* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient
* [MedicationUsage](medicationusage.html): Returns statements for a specific patient.
* [NutritionOrder](nutritionorder.html): The identity of the person who requires the diet, formula or nutritional supplement
* [Observation](observation.html): The subject that the observation is about (if patient)
* [Procedure](procedure.html): Search by subject - a patient
* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
* [ServiceRequest](servicerequest.html): Search by subject - a patient
* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied
* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>AllergyIntolerance.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ClinicalImpression.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.patient | DetectedIssue.patient | DeviceRequest.subject.where(resolve() is Patient) | DeviceUseStatement.subject | DiagnosticReport.subject.where(resolve() is Patient) | DocumentManifest.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EpisodeOfCare.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | List.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationUsage.subject.where(resolve() is Patient) | NutritionOrder.patient | Observation.subject.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | SupplyDelivery.patient | VisionPrescription.patient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PATIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DocumentManifest:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("DocumentManifest:patient").toLocked();

 /**
   * Search parameter: <b>type</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): allergy | intolerance - Underlying mechanism (if known)
* [Composition](composition.html): Kind of composition (LOINC if possible)
* [DocumentManifest](documentmanifest.html): Kind of document set
* [DocumentReference](documentreference.html): Kind of document (LOINC if possible)
* [Encounter](encounter.html): Specific type of encounter
* [EpisodeOfCare](episodeofcare.html): Type/class  - e.g. specialist referral, disease management
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.type | Composition.type | DocumentManifest.type | DocumentReference.type | Encounter.type | EpisodeOfCare.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name="type", path="AllergyIntolerance.type | Composition.type | DocumentManifest.type | DocumentReference.type | Encounter.type | EpisodeOfCare.type", description="Multiple Resources: \r\n\r\n* [AllergyIntolerance](allergyintolerance.html): allergy | intolerance - Underlying mechanism (if known)\r\n* [Composition](composition.html): Kind of composition (LOINC if possible)\r\n* [DocumentManifest](documentmanifest.html): Kind of document set\r\n* [DocumentReference](documentreference.html): Kind of document (LOINC if possible)\r\n* [Encounter](encounter.html): Specific type of encounter\r\n* [EpisodeOfCare](episodeofcare.html): Type/class  - e.g. specialist referral, disease management\r\n", type="token" )
  public static final String SP_TYPE = "type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>type</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): allergy | intolerance - Underlying mechanism (if known)
* [Composition](composition.html): Kind of composition (LOINC if possible)
* [DocumentManifest](documentmanifest.html): Kind of document set
* [DocumentReference](documentreference.html): Kind of document (LOINC if possible)
* [Encounter](encounter.html): Specific type of encounter
* [EpisodeOfCare](episodeofcare.html): Type/class  - e.g. specialist referral, disease management
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.type | Composition.type | DocumentManifest.type | DocumentReference.type | Encounter.type | EpisodeOfCare.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TYPE);


}

