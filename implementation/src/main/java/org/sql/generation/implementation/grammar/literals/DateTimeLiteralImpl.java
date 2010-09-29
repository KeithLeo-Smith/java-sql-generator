/*
 * Copyright (c) 2010, Stanislav Muhametsin. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.sql.generation.implementation.grammar.literals;

import java.sql.Date;

import org.sql.generation.api.common.NullArgumentException;
import org.sql.generation.api.grammar.literals.DateTimeLiteral;
import org.sql.generation.implementation.grammar.common.NonBooleanExpressionImpl;

/**
 * 
 * @author Stanislav Muhametsin
 */
public class DateTimeLiteralImpl extends NonBooleanExpressionImpl<DateTimeLiteral>
    implements DateTimeLiteral
{

    private final Date _date;

    public DateTimeLiteralImpl( Date date )
    {
        this( DateTimeLiteral.class, date );
    }

    protected DateTimeLiteralImpl( Class<? extends DateTimeLiteral> implClass, Date date )
    {
        super( implClass );

        NullArgumentException.validateNotNull( "Date", date );
        this._date = date;
    }

    public Date getDate()
    {
        return this._date;
    }

    @Override
    protected boolean doesEqual( DateTimeLiteral another )
    {
        return this._date.equals( another.getDate() );
    }
}