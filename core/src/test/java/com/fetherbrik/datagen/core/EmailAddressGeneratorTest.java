package com.fetherbrik.datagen.core;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EmailAddressGeneratorTest {

  @Test
  public void testCanGenerateBasicEmailAddress() {
    EmailAddressGenerator gen = new EmailAddressGenerator(
        Supplier.of("example"),
        Supplier.of("gmail.com"));
    assertThat(gen.next(), is("example@gmail.com"));
  }

  @Test
  public void testCanGenerateComplexLocalPart() {
    EmailAddressGenerator gen = new EmailAddressGenerator(
        Supplier.of("example"),
        Supplier.of("gmail.com"));
    assertThat(gen.next(), is("example@gmail.com"));
  }
}
