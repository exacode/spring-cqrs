package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAttrdefAdrelidAdnumIndex is a Querydsl query type for QPgAttrdefAdrelidAdnumIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAttrdefAdrelidAdnumIndex extends com.mysema.query.sql.RelationalPathBase<QPgAttrdefAdrelidAdnumIndex> {

    private static final long serialVersionUID = -879681945;

    public static final QPgAttrdefAdrelidAdnumIndex pgAttrdefAdrelidAdnumIndex = new QPgAttrdefAdrelidAdnumIndex("pg_attrdef_adrelid_adnum_index");

    public final NumberPath<Short> adnum = createNumber("adnum", Short.class);

    public final NumberPath<Long> adrelid = createNumber("adrelid", Long.class);

    public QPgAttrdefAdrelidAdnumIndex(String variable) {
        super(QPgAttrdefAdrelidAdnumIndex.class, forVariable(variable), "pg_catalog", "pg_attrdef_adrelid_adnum_index");
    }

    @SuppressWarnings("all")
    public QPgAttrdefAdrelidAdnumIndex(Path<? extends QPgAttrdefAdrelidAdnumIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_attrdef_adrelid_adnum_index");
    }

    public QPgAttrdefAdrelidAdnumIndex(PathMetadata<?> metadata) {
        super(QPgAttrdefAdrelidAdnumIndex.class, metadata, "pg_catalog", "pg_attrdef_adrelid_adnum_index");
    }

}

