package edu.grinnell.csc207.util;

import java.io.InputStream;
import java.io.PrintWriter;

/**
 * Trees intended to be used in storing mappings between fixed-length 
 * sequences of bits and corresponding values.
 *
 * @author Mina Bakrac
 */
public class BitTree {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * Number of levels in the tree.
   */
  int levels;

  /**
   * The root of the tree.
   */
  BitTreeNode root;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new bit tree.
   * 
   * @param n number of levels.
   */
  public BitTree(int n) {
    this.levels = n;
    this.root = null;
  } // BitTree(int)

  // +---------------+-----------------------------------------------
  // | Local helpers |
  // +---------------+

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Follows path through the tree and adds or replaces value at the end.
   *
   * @param bits the path.
   * @param value the value to add or replace.
   */
  public void set(String bits, String value) {
    if (bits.length() != this.levels) {
      throw new IndexOutOfBoundsException();
    } else {

    }
  } // set(String, String)

  /**
   *
   */
  public String get(String bits) {
    return "";  // STUB
  } // get(String, String)

  /**
   *
   */
  public void dump(PrintWriter pen) {
    // STUB
  } // dump(PrintWriter)

  /**
   *
   */
  public void load(InputStream source) {
    // STUB
  } // load(InputStream)

} // class BitTree
