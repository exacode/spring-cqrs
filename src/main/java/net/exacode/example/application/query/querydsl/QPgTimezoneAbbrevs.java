package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTimezoneAbbrevs is a Querydsl query type for QPgTimezoneAbbrevs
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTimezoneAbbrevs extends com.mysema.query.sql.RelationalPathBase<QPgTimezoneAbbrevs> {

    private static final long serialVersionUID = -2086985443;

    public static final QPgTimezoneAbbrevs pgTimezoneAbbrevs = new QPgTimezoneAbbrevs("pg_timezone_abbrevs");

    public final StringPath abbrev = createString("abbrev");

    public final BooleanPath isDst = createBoolean("is_dst");

    public final SimplePath<Object> utcOffset = createSimple("utc_offset", Object.class);

    public QPgTimezoneAbbrevs(String variable) {
        super(QPgTimezoneAbbrevs.class, forVariable(variable), "pg_catalog", "pg_timezone_abbrevs");
    }

    @SuppressWarnings("all")
    public QPgTimezoneAbbrevs(Path<? extends QPgTimezoneAbbrevs> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_timezone_abbrevs");
    }

    public QPgTimezoneAbbrevs(PathMetadata<?> metadata) {
        super(QPgTimezoneAbbrevs.class, metadata, "pg_catalog", "pg_timezone_abbrevs");
    }

}

