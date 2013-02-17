package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgSettings is a Querydsl query type for QPgSettings
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgSettings extends com.mysema.query.sql.RelationalPathBase<QPgSettings> {

    private static final long serialVersionUID = 1841553534;

    public static final QPgSettings pgSettings = new QPgSettings("pg_settings");

    public final StringPath bootVal = createString("boot_val");

    public final StringPath category = createString("category");

    public final StringPath context = createString("context");

    public final SimplePath<Object[]> enumvals = createSimple("enumvals", Object[].class);

    public final StringPath extraDesc = createString("extra_desc");

    public final StringPath maxVal = createString("max_val");

    public final StringPath minVal = createString("min_val");

    public final StringPath name = createString("name");

    public final StringPath resetVal = createString("reset_val");

    public final StringPath setting = createString("setting");

    public final StringPath shortDesc = createString("short_desc");

    public final StringPath source = createString("source");

    public final StringPath sourcefile = createString("sourcefile");

    public final NumberPath<Integer> sourceline = createNumber("sourceline", Integer.class);

    public final StringPath unit = createString("unit");

    public final StringPath vartype = createString("vartype");

    public QPgSettings(String variable) {
        super(QPgSettings.class, forVariable(variable), "pg_catalog", "pg_settings");
    }

    @SuppressWarnings("all")
    public QPgSettings(Path<? extends QPgSettings> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_settings");
    }

    public QPgSettings(PathMetadata<?> metadata) {
        super(QPgSettings.class, metadata, "pg_catalog", "pg_settings");
    }

}

