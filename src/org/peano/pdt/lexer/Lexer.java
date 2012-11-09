/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.peano.pdt.lexer;

import java.io.*;
import org.peano.pdt.node.*;

@SuppressWarnings("nls")
public class Lexer
{
    protected Token token;
    protected State state = State.INITIAL;

    private PushbackReader in;
    private int line;
    private int pos;
    private boolean cr;
    private boolean eof;
    private final StringBuffer text = new StringBuffer();

    @SuppressWarnings("unused")
    protected void filter() throws LexerException, IOException
    {
        // Do nothing
    }

    public Lexer(@SuppressWarnings("hiding") PushbackReader in)
    {
        this.in = in;
    }
 
    public Token peek() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        return this.token;
    }

    public Token next() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        Token result = this.token;
        this.token = null;
        return result;
    }

    protected Token getToken() throws IOException, LexerException
    {
        int dfa_state = 0;

        int start_pos = this.pos;
        int start_line = this.line;

        int accept_state = -1;
        int accept_token = -1;
        int accept_length = -1;
        int accept_pos = -1;
        int accept_line = -1;

        @SuppressWarnings("hiding") int[][][] gotoTable = Lexer.gotoTable[this.state.id()];
        @SuppressWarnings("hiding") int[] accept = Lexer.accept[this.state.id()];
        this.text.setLength(0);

        while(true)
        {
            int c = getChar();

            if(c != -1)
            {
                switch(c)
                {
                case 10:
                    if(this.cr)
                    {
                        this.cr = false;
                    }
                    else
                    {
                        this.line++;
                        this.pos = 0;
                    }
                    break;
                case 13:
                    this.line++;
                    this.pos = 0;
                    this.cr = true;
                    break;
                default:
                    this.pos++;
                    this.cr = false;
                    break;
                }

                this.text.append((char) c);

                do
                {
                    int oldState = (dfa_state < -1) ? (-2 -dfa_state) : dfa_state;

                    dfa_state = -1;

                    int[][] tmp1 =  gotoTable[oldState];
                    int low = 0;
                    int high = tmp1.length - 1;

                    while(low <= high)
                    {
                        int middle = (low + high) / 2;
                        int[] tmp2 = tmp1[middle];

                        if(c < tmp2[0])
                        {
                            high = middle - 1;
                        }
                        else if(c > tmp2[1])
                        {
                            low = middle + 1;
                        }
                        else
                        {
                            dfa_state = tmp2[2];
                            break;
                        }
                    }
                }while(dfa_state < -1);
            }
            else
            {
                dfa_state = -1;
            }

            if(dfa_state >= 0)
            {
                if(accept[dfa_state] != -1)
                {
                    accept_state = dfa_state;
                    accept_token = accept[dfa_state];
                    accept_length = this.text.length();
                    accept_pos = this.pos;
                    accept_line = this.line;
                }
            }
            else
            {
                if(accept_state != -1)
                {
                    switch(accept_token)
                    {
                    case 0:
                        {
                            @SuppressWarnings("hiding") Token token = new0(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 1:
                        {
                            @SuppressWarnings("hiding") Token token = new1(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 2:
                        {
                            @SuppressWarnings("hiding") Token token = new2(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 3:
                        {
                            @SuppressWarnings("hiding") Token token = new3(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 4:
                        {
                            @SuppressWarnings("hiding") Token token = new4(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 5:
                        {
                            @SuppressWarnings("hiding") Token token = new5(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 6:
                        {
                            @SuppressWarnings("hiding") Token token = new6(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 7:
                        {
                            @SuppressWarnings("hiding") Token token = new7(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 8:
                        {
                            @SuppressWarnings("hiding") Token token = new8(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 9:
                        {
                            @SuppressWarnings("hiding") Token token = new9(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 10:
                        {
                            @SuppressWarnings("hiding") Token token = new10(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 11:
                        {
                            @SuppressWarnings("hiding") Token token = new11(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 12:
                        {
                            @SuppressWarnings("hiding") Token token = new12(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 13:
                        {
                            @SuppressWarnings("hiding") Token token = new13(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 14:
                        {
                            @SuppressWarnings("hiding") Token token = new14(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 15:
                        {
                            @SuppressWarnings("hiding") Token token = new15(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 16:
                        {
                            @SuppressWarnings("hiding") Token token = new16(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 17:
                        {
                            @SuppressWarnings("hiding") Token token = new17(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 18:
                        {
                            @SuppressWarnings("hiding") Token token = new18(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 19:
                        {
                            @SuppressWarnings("hiding") Token token = new19(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 20:
                        {
                            @SuppressWarnings("hiding") Token token = new20(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 21:
                        {
                            @SuppressWarnings("hiding") Token token = new21(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 22:
                        {
                            @SuppressWarnings("hiding") Token token = new22(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 23:
                        {
                            @SuppressWarnings("hiding") Token token = new23(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    }
                }
                else
                {
                    if(this.text.length() > 0)
                    {
                        throw new LexerException(
                            "[" + (start_line + 1) + "," + (start_pos + 1) + "]" +
                            " Unknown token: " + this.text);
                    }

                    @SuppressWarnings("hiding") EOF token = new EOF(
                        start_line + 1,
                        start_pos + 1);
                    return token;
                }
            }
        }
    }

    Token new0(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenVertex(line, pos); }
    Token new1(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenCell(line, pos); }
    Token new2(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenState(line, pos); }
    Token new3(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenComponent(line, pos); }
    Token new4(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenNamespace(line, pos); }
    Token new5(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenRead(line, pos); }
    Token new6(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenWrite(line, pos); }
    Token new7(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenScalar(line, pos); }
    Token new8(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenVectorD(line, pos); }
    Token new9(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenVectorTwoPowD(line, pos); }
    Token new10(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenStencil(line, pos); }
    Token new11(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenName(line, pos); }
    Token new12(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenDastgenFile(line, pos); }
    Token new13(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenEventMapping(line, pos); }
    Token new14(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenAdapter(line, pos); }
    Token new15(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenMergeWithUserDefinedAdapter(line, pos); }
    Token new16(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTokenMergeWithPredefinedAdapter(line, pos); }
    Token new17(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBlank(text, line, pos); }
    Token new18(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TIdentifier(text, line, pos); }
    Token new19(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TFilename(text, line, pos); }
    Token new20(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNamespace(text, line, pos); }
    Token new21(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTraditionalComment(text, line, pos); }
    Token new22(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDocumentationComment(text, line, pos); }
    Token new23(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TEndOfLineComment(text, line, pos); }

    private int getChar() throws IOException
    {
        if(this.eof)
        {
            return -1;
        }

        int result = this.in.read();

        if(result == -1)
        {
            this.eof = true;
        }

        return result;
    }

    private void pushBack(int acceptLength) throws IOException
    {
        int length = this.text.length();
        for(int i = length - 1; i >= acceptLength; i--)
        {
            this.eof = false;

            this.in.unread(this.text.charAt(i));
        }
    }

    protected void unread(@SuppressWarnings("hiding") Token token) throws IOException
    {
        @SuppressWarnings("hiding") String text = token.getText();
        int length = text.length();

        for(int i = length - 1; i >= 0; i--)
        {
            this.eof = false;

            this.in.unread(text.charAt(i));
        }

        this.pos = token.getPos() - 1;
        this.line = token.getLine() - 1;
    }

    private String getText(int acceptLength)
    {
        StringBuffer s = new StringBuffer(acceptLength);
        for(int i = 0; i < acceptLength; i++)
        {
            s.append(this.text.charAt(i));
        }

        return s.toString();
    }

    private static int[][][][] gotoTable;
/*  {
        { // INITIAL
            {{9, 9, 1}, {10, 10, 2}, {13, 13, 3}, {32, 32, 4}, {45, 45, 5}, {46, 46, 6}, {47, 47, 7}, {48, 57, 8}, {58, 58, 9}, {65, 90, 10}, {95, 95, 11}, {97, 97, 12}, {98, 98, 10}, {99, 99, 13}, {100, 100, 14}, {101, 101, 15}, {102, 108, 10}, {109, 109, 16}, {110, 110, 17}, {111, 113, 10}, {114, 114, 18}, {115, 115, 19}, {116, 117, 10}, {118, 118, 20}, {119, 119, 21}, {120, 122, 10}, },
            {{9, 32, -2}, },
            {{9, 32, -2}, },
            {{9, 32, -2}, },
            {{9, 32, -2}, },
            {{45, 45, 5}, {46, 46, 22}, {47, 47, 23}, {48, 57, 24}, {65, 90, 25}, {95, 95, 26}, {97, 122, 25}, },
            {{45, 46, -2}, {47, 47, 23}, {48, 57, 8}, {58, 58, 27}, {65, 90, 28}, {95, 95, 29}, {97, 122, 28}, },
            {{42, 42, 30}, {45, 46, -7}, {47, 47, 31}, {48, 122, -7}, },
            {{45, 122, -8}, },
            {{58, 58, 32}, },
            {{45, 47, -8}, {48, 57, 33}, {58, 58, 27}, {65, 90, 34}, {95, 95, 35}, {97, 122, 34}, },
            {{45, 122, -12}, },
            {{45, 95, -12}, {97, 99, 34}, {100, 100, 36}, {101, 122, 34}, },
            {{45, 95, -12}, {97, 100, 34}, {101, 101, 37}, {102, 110, 34}, {111, 111, 38}, {112, 122, 34}, },
            {{45, 95, -12}, {97, 97, 39}, {98, 122, 34}, },
            {{45, 95, -12}, {97, 117, 34}, {118, 118, 40}, {119, 122, 34}, },
            {{45, 100, -15}, {101, 101, 41}, {102, 122, 34}, },
            {{45, 95, -12}, {97, 97, 42}, {98, 122, 34}, },
            {{45, 100, -15}, {101, 101, 43}, {102, 122, 34}, },
            {{45, 95, -12}, {97, 98, 34}, {99, 99, 44}, {100, 115, 34}, {116, 116, 45}, {117, 122, 34}, },
            {{45, 100, -15}, {101, 101, 46}, {102, 122, 34}, },
            {{45, 95, -12}, {97, 113, 34}, {114, 114, 47}, {115, 122, 34}, },
            {{45, 122, -7}, },
            {{45, 46, -7}, {48, 122, -7}, },
            {{45, 122, -7}, },
            {{45, 122, -7}, },
            {{45, 122, -7}, },
            {{58, 58, 48}, },
            {{45, 122, -8}, },
            {{45, 122, -8}, },
            {{0, 41, 49}, {42, 42, 50}, {43, 127, 49}, },
            {{0, 9, 51}, {10, 10, 52}, {11, 12, 51}, {13, 13, 53}, {14, 127, 51}, },
            {{46, 46, 54}, {48, 57, 55}, {65, 90, 56}, {95, 95, 57}, {97, 122, 56}, },
            {{45, 122, -12}, },
            {{45, 122, -12}, },
            {{45, 122, -12}, },
            {{45, 95, -12}, {97, 97, 58}, {98, 122, 34}, },
            {{45, 95, -12}, {97, 107, 34}, {108, 108, 59}, {109, 122, 34}, },
            {{45, 95, -12}, {97, 108, 34}, {109, 109, 60}, {110, 122, 34}, },
            {{45, 95, -12}, {97, 114, 34}, {115, 115, 61}, {116, 122, 34}, },
            {{45, 100, -15}, {101, 101, 62}, {102, 122, 34}, },
            {{45, 113, -23}, {114, 114, 63}, {115, 122, 34}, },
            {{45, 108, -40}, {109, 109, 64}, {110, 122, 34}, },
            {{45, 95, -12}, {97, 97, 65}, {98, 122, 34}, },
            {{45, 95, -12}, {97, 97, 66}, {98, 122, 34}, },
            {{45, 95, -12}, {97, 97, 67}, {98, 100, 34}, {101, 101, 68}, {102, 122, 34}, },
            {{45, 98, -21}, {99, 99, 69}, {100, 113, 34}, {114, 114, 70}, {115, 122, 34}, },
            {{45, 95, -12}, {97, 104, 34}, {105, 105, 71}, {106, 122, 34}, },
            {{46, 122, -34}, },
            {{0, 41, 49}, {42, 42, 72}, {43, 127, 49}, },
            {{0, 41, 73}, {42, 42, 74}, {43, 46, 73}, {47, 47, 75}, {48, 127, 73}, },
            {{0, 127, -33}, },
            {},
            {{10, 10, 76}, },
            {{46, 57, -34}, {58, 58, 27}, {65, 122, -34}, },
            {{46, 122, -56}, },
            {{46, 122, -56}, },
            {{46, 122, -56}, },
            {{45, 95, -12}, {97, 111, 34}, {112, 112, 77}, {113, 122, 34}, },
            {{45, 107, -39}, {108, 108, 78}, {109, 122, 34}, },
            {{45, 111, -60}, {112, 112, 79}, {113, 122, 34}, },
            {{45, 95, -12}, {97, 115, 34}, {116, 116, 80}, {117, 122, 34}, },
            {{45, 95, -12}, {97, 109, 34}, {110, 110, 81}, {111, 122, 34}, },
            {{45, 95, -12}, {97, 102, 34}, {103, 103, 82}, {104, 122, 34}, },
            {{45, 100, -15}, {101, 101, 83}, {102, 122, 34}, },
            {{45, 99, -14}, {100, 100, 84}, {101, 122, 34}, },
            {{45, 107, -39}, {108, 108, 85}, {109, 122, 34}, },
            {{45, 115, -63}, {116, 116, 86}, {117, 122, 34}, },
            {{45, 109, -64}, {110, 110, 87}, {111, 122, 34}, },
            {{45, 115, -63}, {116, 116, 88}, {117, 122, 34}, },
            {{45, 115, -63}, {116, 116, 89}, {117, 122, 34}, },
            {{45, 115, -63}, {116, 116, 90}, {117, 122, 34}, },
            {{0, 41, 91}, {42, 42, 72}, {43, 46, 91}, {47, 47, 92}, {48, 127, 91}, },
            {{0, 41, 93}, {42, 42, 94}, {43, 127, 93}, },
            {{0, 127, -52}, },
            {},
            {},
            {{45, 115, -63}, {116, 116, 95}, {117, 122, 34}, },
            {{45, 57, -12}, {58, 58, 96}, {65, 122, -12}, },
            {{45, 95, -12}, {97, 110, 34}, {111, 111, 97}, {112, 122, 34}, },
            {{45, 102, -65}, {103, 103, 98}, {104, 122, 34}, },
            {{45, 115, -63}, {116, 116, 99}, {117, 122, 34}, },
            {{45, 100, -15}, {101, 101, 100}, {102, 122, 34}, },
            {{45, 57, -12}, {58, 58, 101}, {65, 114, -41}, {115, 115, 102}, {116, 122, 34}, },
            {{45, 122, -12}, },
            {{45, 95, -12}, {97, 97, 103}, {98, 122, 34}, },
            {{45, 100, -15}, {101, 101, 104}, {102, 122, 34}, },
            {{45, 98, -21}, {99, 99, 105}, {100, 122, 34}, },
            {{45, 110, -81}, {111, 111, 106}, {112, 122, 34}, },
            {{45, 100, -15}, {101, 101, 107}, {102, 122, 34}, },
            {{45, 100, -15}, {101, 101, 108}, {102, 122, 34}, },
            {{0, 41, 109}, {42, 42, 110}, {43, 127, 109}, },
            {},
            {{0, 127, -75}, },
            {{0, 41, 73}, {42, 42, 94}, {43, 127, -52}, },
            {{45, 100, -15}, {101, 101, 111}, {102, 122, 34}, },
            {{58, 58, 48}, },
            {{45, 109, -64}, {110, 110, 112}, {111, 122, 34}, },
            {{45, 100, -15}, {101, 101, 113}, {102, 122, 34}, },
            {{45, 45, 114}, {46, 122, -12}, },
            {{45, 45, 115}, {46, 122, -12}, },
            {{58, 58, 48}, },
            {{45, 111, -60}, {112, 112, 116}, {113, 122, 34}, },
            {{45, 113, -23}, {114, 114, 117}, {115, 122, 34}, },
            {{45, 57, -12}, {58, 58, 118}, {65, 122, -12}, },
            {{45, 104, -49}, {105, 105, 119}, {106, 122, 34}, },
            {{45, 113, -23}, {114, 114, 120}, {115, 122, 34}, },
            {{45, 95, -12}, {97, 119, 34}, {120, 120, 121}, {121, 122, 34}, },
            {{45, 122, -12}, },
            {{0, 127, -93}, },
            {{0, 41, 91}, {42, 42, 110}, {43, 127, -74}, },
            {{45, 113, -23}, {114, 114, 122}, {115, 122, 34}, },
            {{45, 100, -15}, {101, 101, 123}, {102, 122, 34}, },
            {{45, 109, -64}, {110, 110, 124}, {111, 122, 34}, },
            {{45, 95, -7}, {97, 108, 25}, {109, 109, 125}, {110, 122, 25}, },
            {{45, 95, -7}, {97, 118, 25}, {119, 119, 126}, {120, 122, 25}, },
            {{45, 95, -12}, {97, 97, 127}, {98, 122, 34}, },
            {{45, 57, -12}, {58, 58, 128}, {65, 122, -12}, },
            {{58, 58, 48}, },
            {{45, 107, -39}, {108, 108, 129}, {109, 122, 34}, },
            {{45, 47, -8}, {48, 49, 33}, {50, 50, 130}, {51, 57, 33}, {58, 58, 131}, {65, 122, -12}, },
            {{45, 57, -12}, {58, 58, 132}, {65, 122, -12}, },
            {{45, 57, -12}, {58, 58, 133}, {65, 122, -12}, },
            {{45, 109, -64}, {110, 110, 134}, {111, 122, 34}, },
            {{45, 45, 135}, {46, 122, -12}, },
            {{45, 95, -7}, {97, 97, 136}, {98, 122, 25}, },
            {{45, 95, -7}, {97, 104, 25}, {105, 105, 137}, {106, 122, 25}, },
            {{45, 98, -21}, {99, 99, 138}, {100, 122, 34}, },
            {{58, 58, 48}, },
            {{45, 57, -12}, {58, 58, 139}, {65, 122, -12}, },
            {{45, 58, -12}, {65, 79, 34}, {80, 80, 140}, {81, 90, 34}, {95, 122, -12}, },
            {{58, 58, 48}, },
            {{58, 58, 48}, },
            {{58, 58, 48}, },
            {{45, 115, -63}, {116, 116, 141}, {117, 122, 34}, },
            {{45, 95, -7}, {97, 101, 25}, {102, 102, 142}, {103, 122, 25}, },
            {{45, 95, -7}, {97, 111, 25}, {112, 112, 143}, {113, 122, 25}, },
            {{45, 95, -7}, {97, 115, 25}, {116, 116, 144}, {117, 122, 25}, },
            {{45, 100, -15}, {101, 101, 145}, {102, 122, 34}, },
            {{58, 58, 48}, },
            {{45, 110, -81}, {111, 111, 146}, {112, 122, 34}, },
            {{45, 57, -12}, {58, 58, 147}, {65, 122, -12}, },
            {{45, 104, -128}, {105, 105, 148}, {106, 122, 25}, },
            {{45, 111, -138}, {112, 112, 149}, {113, 122, 25}, },
            {{45, 95, -7}, {97, 103, 25}, {104, 104, 150}, {105, 122, 25}, },
            {{45, 57, -12}, {58, 58, 151}, {65, 122, -12}, },
            {{45, 95, -12}, {97, 118, 34}, {119, 119, 152}, {120, 122, 34}, },
            {{58, 58, 48}, },
            {{45, 95, -7}, {97, 107, 25}, {108, 108, 153}, {109, 122, 25}, },
            {{45, 104, -128}, {105, 105, 154}, {106, 122, 25}, },
            {{45, 45, 155}, {46, 122, -7}, },
            {{58, 58, 48}, },
            {{45, 58, -12}, {65, 67, 34}, {68, 68, 156}, {69, 90, 34}, {95, 122, -12}, },
            {{45, 95, -7}, {97, 100, 25}, {101, 101, 157}, {102, 122, 25}, },
            {{45, 95, -7}, {97, 109, 25}, {110, 110, 158}, {111, 122, 25}, },
            {{45, 111, -138}, {112, 112, 159}, {113, 116, 25}, {117, 117, 160}, {118, 122, 25}, },
            {{45, 57, -12}, {58, 58, 161}, {65, 122, -12}, },
            {{45, 57, -7}, {58, 58, 162}, {65, 122, -7}, },
            {{45, 95, -7}, {97, 102, 25}, {103, 103, 163}, {104, 122, 25}, },
            {{45, 95, -7}, {97, 113, 25}, {114, 114, 164}, {115, 122, 25}, },
            {{45, 95, -7}, {97, 114, 25}, {115, 115, 165}, {116, 122, 25}, },
            {{58, 58, 48}, },
            {},
            {{45, 57, -7}, {58, 58, 166}, {65, 122, -7}, },
            {{45, 100, -155}, {101, 101, 167}, {102, 122, 25}, },
            {{45, 100, -155}, {101, 101, 168}, {102, 122, 25}, },
            {},
            {{45, 95, -7}, {97, 99, 25}, {100, 100, 169}, {101, 122, 25}, },
            {{45, 113, -161}, {114, 114, 170}, {115, 122, 25}, },
            {{45, 100, -155}, {101, 101, 171}, {102, 122, 25}, },
            {{45, 45, 172}, {46, 122, -7}, },
            {{45, 101, -137}, {102, 102, 173}, {103, 122, 25}, },
            {{45, 99, -169}, {100, 100, 174}, {101, 122, 25}, },
            {{45, 104, -128}, {105, 105, 175}, {106, 122, 25}, },
            {{45, 100, -155}, {101, 101, 176}, {102, 122, 25}, },
            {{45, 109, -156}, {110, 110, 177}, {111, 122, 25}, },
            {{45, 101, -137}, {102, 102, 178}, {103, 122, 25}, },
            {{45, 100, -155}, {101, 101, 179}, {102, 122, 25}, },
            {{45, 104, -128}, {105, 105, 180}, {106, 122, 25}, },
            {{45, 99, -169}, {100, 100, 181}, {101, 122, 25}, },
            {{45, 109, -156}, {110, 110, 182}, {111, 122, 25}, },
            {{45, 45, 183}, {46, 122, -7}, },
            {{45, 100, -155}, {101, 101, 184}, {102, 122, 25}, },
            {{45, 108, -116}, {109, 109, 185}, {110, 122, 25}, },
            {{45, 99, -169}, {100, 100, 186}, {101, 122, 25}, },
            {{45, 95, -7}, {97, 97, 187}, {98, 122, 25}, },
            {{45, 45, 188}, {46, 122, -7}, },
            {{45, 111, -138}, {112, 112, 189}, {113, 122, 25}, },
            {{45, 108, -116}, {109, 109, 190}, {110, 122, 25}, },
            {{45, 111, -138}, {112, 112, 191}, {113, 122, 25}, },
            {{45, 95, -7}, {97, 97, 192}, {98, 122, 25}, },
            {{45, 104, -128}, {105, 105, 193}, {106, 122, 25}, },
            {{45, 111, -138}, {112, 112, 194}, {113, 122, 25}, },
            {{45, 109, -156}, {110, 110, 195}, {111, 122, 25}, },
            {{45, 111, -138}, {112, 112, 196}, {113, 122, 25}, },
            {{45, 102, -160}, {103, 103, 197}, {104, 122, 25}, },
            {{45, 104, -128}, {105, 105, 198}, {106, 122, 25}, },
            {{45, 57, -7}, {58, 58, 199}, {65, 122, -7}, },
            {{45, 109, -156}, {110, 110, 200}, {111, 122, 25}, },
            {},
            {{45, 102, -160}, {103, 103, 201}, {104, 122, 25}, },
            {{45, 57, -7}, {58, 58, 202}, {65, 122, -7}, },
            {},
        }
    };*/

    private static int[][] accept;
/*  {
        // INITIAL
        {-1, 17, 17, 17, 17, 19, 19, -1, 19, -1, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, -1, 19, 19, 19, -1, 19, 19, -1, -1, -1, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, -1, -1, -1, -1, 23, 23, 20, 20, 20, 20, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, -1, -1, -1, 22, 23, 18, 18, 18, 18, 18, 18, 18, 5, 18, 18, 18, 18, 18, 18, -1, 21, -1, -1, 18, 1, 18, 18, 18, 18, 11, 18, 18, 18, 18, 18, 18, 6, -1, -1, 18, 18, 18, 19, 19, 18, 18, 2, 18, 18, 18, 18, 18, 18, 19, 19, 18, 7, 18, 18, 8, 0, 14, 18, 19, 19, 19, 18, 10, 18, 18, 19, 19, 19, 18, 18, 3, 19, 19, 19, 4, 18, 19, 19, 19, 18, 19, 19, 19, 19, 9, 12, 19, 19, 19, 13, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 16, 19, 19, 15, },

    };*/

    public static class State
    {
        public final static State INITIAL = new State(0);

        private int id;

        private State(@SuppressWarnings("hiding") int id)
        {
            this.id = id;
        }

        public int id()
        {
            return this.id;
        }
    }

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Lexer.class.getResourceAsStream("lexer.dat")));

            // read gotoTable
            int length = s.readInt();
            gotoTable = new int[length][][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][][];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                    length = s.readInt();
                    gotoTable[i][j] = new int[length][3];
                    for(int k = 0; k < gotoTable[i][j].length; k++)
                    {
                        for(int l = 0; l < 3; l++)
                        {
                            gotoTable[i][j][k][l] = s.readInt();
                        }
                    }
                }
            }

            // read accept
            length = s.readInt();
            accept = new int[length][];
            for(int i = 0; i < accept.length; i++)
            {
                length = s.readInt();
                accept[i] = new int[length];
                for(int j = 0; j < accept[i].length; j++)
                {
                    accept[i][j] = s.readInt();
                }
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"lexer.dat\" is either missing or corrupted.");
        }
    }
}