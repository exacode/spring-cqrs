package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTimezoneNames is a Querydsl query type for QPgTimezoneNames
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTimezoneNames extends com.mysema.query.sql.RelationalPathBase<QPgTimezoneNames> {

    private static final long serialVersionUID = 313724756;

    public static final QPgTimezoneNames pgTimezoneNames = new QPgTimezoneNames("pg_timezone_names");

    public final StringPath abbrev = createString("abbrev");

    public final BooleanPath isDst = createBoolean("is_dst");

    public final StringPath name = createString("name");

    public final SimplePath<Object> utcOffset = createSimple("utc_offset", Object.class);

    public QPgTimezoneNames(String variable) {
        super(QPgTimezoneNames.class, forVariable(variable), "pg_catalog", "pg_timezone_names");
    }

    @SuppressWarnings("all")
    public QPgTimezoneNames(Path<? extends QPgTimezoneNames> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_timezone_names");
    }

    public QPgTimezoneNames(PathMetadata<?> metadata) {
        super(QPgTimezoneNames.class, metadata, "pg_catalog", "pg_timezone_names");
    }

}

