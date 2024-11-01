package org.hl7.fhir.r5.test.profiles;

import java.util.List;
import java.util.ArrayList;
import javax.annotation.Nullable;
import java.util.Date;


import org.hl7.fhir.r5.context.IWorkerContext;
import org.hl7.fhir.r5.model.*;
import org.hl7.fhir.r5.profilemodel.PEBuilder;
import org.hl7.fhir.r5.profilemodel.PEInstance;
import org.hl7.fhir.r5.profilemodel.PEBuilder.PEElementPropertiesPolicy;
import org.hl7.fhir.r5.profilemodel.gen.PEGeneratedBase;
import org.hl7.fhir.r5.profilemodel.gen.Min;
import org.hl7.fhir.r5.profilemodel.gen.Max;
import org.hl7.fhir.r5.profilemodel.gen.Label;
import org.hl7.fhir.r5.profilemodel.gen.Doco;
import org.hl7.fhir.r5.profilemodel.gen.BindingStrength;
import org.hl7.fhir.r5.profilemodel.gen.ValueSet;
import org.hl7.fhir.r5.profilemodel.gen.MustSupport;
import org.hl7.fhir.r5.profilemodel.gen.Definition;


// Generated by the HAPI Java Profile Generator, 28/10/24, 7:31 am

/**
 * Extension for the last date a Condition-instance was confirmed valid in its 
 * current state. E.g. with its current clinical- and verification status, stage 
 * and severity. Typically the last performed follow-up
 *
 */
public class ConditionLastAssertedDate extends PEGeneratedBase {

  private static final String CANONICAL_URL = "http://hl7.dk/fhir/core/StructureDefinition/ConditionLastAssertedDate|3.2.0";


  /**
   * Parameter-less constructor.
   *
   */
  public ConditionLastAssertedDate() {
  }

  /**
   * Used when loading other models 
   *
   */
  public static ConditionLastAssertedDate fromSource(PEInstance source) {
    ConditionLastAssertedDate theThing = new ConditionLastAssertedDate();
    theThing.workerContext = source.getContext();
    theThing.load(source);
    return theThing;
  }

  public void load(PEInstance src) {
    clear();

  }

  public void save(PEInstance tgt, boolean nulls) {

  }



  public void clear() {

  }

}
